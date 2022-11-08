import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.AlunoException;
import exceptions.PessoaException;
import model.Aluno;
import model.Pessoa;
import repository.RepositoryImple;
import service.AlunoService;
import service.PessoaService;
import util.Menu;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
	  Scanner sc = new Scanner(System.in);
	  PessoaService pessoaService = new PessoaService(sc);
	  AlunoService alunoService = new AlunoService(sc);
	  boolean continua = true;
	  
	  do {
		  try {
		  Menu.bemVindo();
		  Menu.menuEscolhaUmaOpcao();
		  
		  int opcao = sc.nextInt();
		  
		  if(opcao == 1) {
			 Menu.menuPessoaOuAluno();
			     int pessoaOuAluno = sc.nextInt();
			       if(pessoaOuAluno == 1) {
			       pessoaService.cadastrarPessoa();
			   }else if(pessoaOuAluno == 2) {
			  	alunoService.cadastrarAluno();
			  }
		  }else if (opcao == 2) {
			  pessoaService.mostrarTodasAsPessoas();
			  alunoService.mostrarTodosOsAlunos();
		  }else if (opcao == 3) {
			  Menu.menuAtualizarPessoaOuAluno();
			    int opcaoPessoaOuAluno = sc.nextInt();
			    
			    if (opcaoPessoaOuAluno == 1) {
			    	sc.nextLine();
			        System.out.println("Digite o número do cadastro da pessoa que você deseja atualizar:");			    	
			        pessoaService.mostrarTodasAsPessoas();
			        int numeroCadastroPessoa = sc.nextInt();
			        Pessoa pessoa = pessoaService.buscarPorId(numeroCadastroPessoa);
			        System.out.println();
			        System.out.println("Cadastro selecionado:");
			        System.out.println(pessoa);
			        System.out.println();
			        System.out.println("Digite o Nome");
			        String nomeAtualizadoPessoa = sc.next();
			        pessoa.setNome(nomeAtualizadoPessoa);			        
			        sc.nextLine();
			        System.out.println("Digite o Telefone");
			        String telefoneAtualizadoPessoa = sc.next();
			        pessoa.setTefefone(telefoneAtualizadoPessoa);			        
			        sc.nextLine();
			        System.out.println("Digite a Data de Nascimento");
			        String dataNascimentoAtualizadaPessoa = sc.next();
			        pessoa.setDatanascimento(dataNascimentoAtualizadaPessoa);
			        Date dataAtual= new Date();
			        SimpleDateFormat formatarAgora = new SimpleDateFormat("dd/MM/yyyy");
			        String dataAtualizada = formatarAgora.format(dataAtual);
			        pessoa.setDataUltimaAlteracao(dataAtualizada);
			        pessoaService.atualizarPessoa(pessoa);
			        System.out.println();
			        System.out.println("Cadastro atualizado com sucesso!");
			        System.out.println();
			        System.out.println(pessoa);
			    }else if (opcaoPessoaOuAluno == 2) {
			    	sc.nextLine();
			        System.out.println("Digite o número do cadastro do aluno que você deseja atualizar:");			    				    	
			    	alunoService.mostrarTodosOsAlunos();
			        int numeroCadastroAluno = sc.nextInt();
			        Aluno aluno = alunoService.buscarPorId(numeroCadastroAluno);
			        System.out.println();
			        System.out.println("Cadastro selecionado:");
			        System.out.println(aluno);
			        System.out.println();
			        System.out.println("Digite o Nome");
			        String nomeAtualizadoAluno = sc.next();
			        aluno.setNome(nomeAtualizadoAluno);			        
			        sc.nextLine();
			        System.out.println("Digite o Telefone");
			        String telefoneAtualizadoAluno = sc.next();
			        aluno.setTefefone(telefoneAtualizadoAluno);			        
			        sc.nextLine();
			        System.out.println("Digite a Data de Nascimento");
			        String dataNascimentoAtualizadaAluno = sc.next();
			        aluno.setDatanascimento(dataNascimentoAtualizadaAluno);			        
			        sc.nextLine();
			        System.out.println("Digite a nota final do curso");
			        Double notaFinaldoCursoAtualizada = sc.nextDouble();
			        aluno.setNotaFinaldoCurso(notaFinaldoCursoAtualizada);
			        Date dataAtualagora= new Date();
			        SimpleDateFormat formatarparaString = new SimpleDateFormat("dd/MM/yyyy");
			        String dataAtualizadaAluno = formatarparaString.format(dataAtualagora);
			        aluno.setDataUltimaAlteracao(dataAtualizadaAluno);
			        alunoService.atualizarAluno(aluno);
			        System.out.println();
			        System.out.println(aluno);
			        
			    }
			    
		  }else if (opcao == 4) {
			  Menu.menuExcluir();
			  
			  int opcaoExcluir = sc.nextInt();
			    if (opcaoExcluir == 1) {
			    	sc.nextLine();
			    	System.out.println("Digite o número do contato que você deseja excluir:");
			    	System.out.println();
			    	pessoaService.mostrarTodasAsPessoas();
			    	System.out.println();
			    	int numeroContatoPessoaExcluir = sc.nextInt();
			    	pessoaService.excluirPessoa(numeroContatoPessoaExcluir);
			    	System.out.println();
			    	System.out.println("Contato excluido com sucesso");
			    	System.out.println();
			    	pessoaService.mostrarTodasAsPessoas();
			    }else if (opcaoExcluir == 2) {
			    	sc.nextLine();
			    	System.out.println("Digite o número do contato que você deseja excluir:");
			    	System.out.println();
			    	alunoService.mostrarTodosOsAlunos();
			    	System.out.println();
			    	int numeroContatoAlunoExcluir = sc.nextInt();
			    	alunoService.excluirAluno(numeroContatoAlunoExcluir);
			    	System.out.println();
			    	System.out.println("Contato excluido com sucesso");
			    	System.out.println();
			    	alunoService.mostrarTodosOsAlunos();
			    }
		  }else if(opcao == 5) {
			  continua = false;
		  }
		  }catch(InputMismatchException e) {
			  System.out.println("Opção Inválida.");
			  System.out.println("Tente novamente!");
		  }catch(AlunoException e) {
			  System.out.println(e.getMessage());
		  }catch(PessoaException e) {
			  System.out.println(e.getMessage());
		  }finally {
			  Thread.sleep(2000);
			  sc.nextLine();
		  }
		  
	  }while(continua);
	}

}

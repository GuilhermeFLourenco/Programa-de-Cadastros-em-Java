package service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.Pessoa;
import repository.RepositoryImple;

public class PessoaService {
	
	private RepositoryImple<Integer, Pessoa> repository = new RepositoryImple<>();
	Scanner sc;
	
	public PessoaService(Scanner sc) {
		this.sc = sc;
		
		Pessoa pessoa1 = new Pessoa("João", "33575010", "11/02/1973","10/03/2022","10/09/2022");
		Pessoa pessoa2 = new Pessoa("Miguel", "33575020", "10/05/1949","10/03/2022","15/09/2022");
		Pessoa pessoa3 = new Pessoa("Ana", "33575030", "08/05/1970","10/03/2022","10/10/2022");
		Pessoa pessoa4 = new Pessoa("Gisele", "33575040", "15/04/1980","10/03/2022","18/08/2022");
		
		repository.salvar(pessoa1.getId(), pessoa1);
		repository.salvar(pessoa2.getId(), pessoa2);
		repository.salvar(pessoa3.getId(), pessoa3);
		repository.salvar(pessoa4.getId(), pessoa4);
	}
    
	 public void cadastrarPessoa() {
	   sc.nextLine();
		
		System.out.println("Digite o Nome");
		String nome = sc.nextLine();
		System.out.println("Digite o Telefone");
		String telefone = sc.nextLine();
        System.out.println("Digite a Data de Nascimento");
        String dataNascimento = sc.nextLine();
        
        Date dataAgora= new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        String dataDeCadastro = formatar.format(dataAgora);
        
        Date dataAgoraa= new Date();
        SimpleDateFormat formatarr = new SimpleDateFormat("dd/MM/yyyy");
        String dataDaUltimaalteracao = formatarr.format(dataAgoraa);
        
        Pessoa pessoa = new Pessoa(nome,telefone,dataNascimento, dataDeCadastro, dataDaUltimaalteracao );
        
        repository.salvar(pessoa.getId(), pessoa);
        
        System.out.println("Cadastro realizado com sucesso!");
        System.out.println();
        System.out.println(pessoa);
        
	}
	
	public void mostrarTodasAsPessoas() {
         for(Pessoa pessoa: repository.buscarTodos()) {
 			System.out.println(pessoa.getId() + " - " + pessoa.getNome() + " , Telefone: " 
 				    + pessoa.getTefefone() + " - Data de Nascimento: " + pessoa.getDatanascimento() + " - Data de cadastro: " 
 					+ pessoa.getDatacadastro() + " - Data da ultima alteração: " + pessoa.getDataUltimaAlteracao());
         }       	 
      }
	
	public void atualizarPessoa(Pessoa pessoa) {
		this.repository.salvar(pessoa.getId(), pessoa);
	}
	
	public Pessoa buscarPorId(Integer id) {
		Pessoa pessoa = this.repository.buscarPorId(id);	
		
		return pessoa;
	}
	
	public void excluirPessoa(Integer id) {
		repository.excluir(id);
	}
}


package service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.Aluno;
import model.Pessoa;
import repository.RepositoryImple;

public class AlunoService {

	private RepositoryImple<Integer, Aluno> repository = new RepositoryImple<>();
    
	Scanner sc;
    
	public AlunoService(Scanner sc) {
		this.sc = sc;
		
		Aluno aluno1 = new Aluno("Henrique", "33575050", "10/04/1990", 10.0 ,"10/03/2022","10/09/2022");
		Aluno aluno2 = new Aluno("Renato", "33575060", "09/09/1992", 10.0 ,"10/03/2022","10/09/2022");
		Aluno aluno3 = new Aluno("Sandra", "33575070", "12/02/1987", 10.0 ,"10/03/2022","10/09/2022");
		Aluno aluno4 = new Aluno("Simone", "33575080", "08/02/1990", 10.0 ,"10/03/2022","10/09/2022");
		repository.salvar(aluno1.getId(), aluno1);
		repository.salvar(aluno2.getId(), aluno2);
		repository.salvar(aluno3.getId(), aluno3);
		repository.salvar(aluno4.getId(), aluno4);		
	}
	
	public void cadastrarAluno() {
		sc.nextLine();
		
		System.out.println("Digite o Nome");
		String nome = sc.nextLine();
		System.out.println("Digite o Telefone");
		String telefone = sc.nextLine();
        System.out.println("Digite a Data de Nascimento");
        String dataNascimento = sc.nextLine();
        System.out.println("Digite a nota final do curso");
        Double notaFinaldoCurso = sc.nextDouble();
        
        Date dataAgoraAluno= new Date();
        SimpleDateFormat formatarDataAluno = new SimpleDateFormat("dd/MM/yyyy");
        String dataDeCadastroAluno = formatarDataAluno.format(dataAgoraAluno);
       
        Date dataAgoraaAluno= new Date();
        SimpleDateFormat formatarrDataAluno = new SimpleDateFormat("dd/MM/yyyy");
        String dataDaUltimaalteracaoAluno = formatarrDataAluno.format(dataAgoraaAluno);

        
        Aluno aluno = new Aluno(nome,telefone,dataNascimento, notaFinaldoCurso, dataDeCadastroAluno, dataDaUltimaalteracaoAluno );
        
        repository.salvar(aluno.getId(), aluno);
        
        System.out.println("Cadastro realizado com sucesso!");
        System.out.println();
        System.out.println(aluno);

	}
	
	public void mostrarTodosOsAlunos() {
		for(Aluno aluno: repository.buscarTodos()) {
			System.out.println(aluno.getId() + " - " + aluno.getNome() + " , Telefone: " 
		    + aluno.getTefefone() + " - Data de Nascimento: " + aluno.getDatanascimento() + " - Nota final do Curso: " + aluno.getNotaFinaldoCurso() + " - Data de cadastro: " 
				+ aluno.getDatacadastro() + " - Data da ultima alteração: " + aluno.getDataUltimaAlteracao());
		}
	}
	
	
	public Aluno buscarPorId(Integer id) {
		Aluno aluno = this.repository.buscarPorId(id);
		
		return aluno;
	}
    
	public void atualizarAluno(Aluno aluno) {
		this.repository.salvar(aluno.getId(), aluno);
	}
	
	public void excluirAluno(Integer id) {
		repository.excluir(id);
	}
}

package util;

public class Menu {
     
	public static void bemVindo() {
		System.out.println("===============================================");
		System.out.println("Bem Vindo ao Sistema de Cadastros Institucional");
		System.out.println("===============================================");
	}
	
	public static void menuEscolhaUmaOpcao() {
		System.out.println();
		System.out.println("Digite o número da opção desejada:");
		System.out.println("1 - Criar Pessoa ou Aluno");
		System.out.println("2 - Visualizar as pessoas e alunos criados");
		System.out.println("3 - Atualizar dados de uma pessoa ou aluno");
		System.out.println("4 - Deletar uma pessoa ou aluno");
		System.out.println("5 - Encerrar o programa");
	}
	
	public static void menuPessoaOuAluno() {
		System.out.println();
		System.out.println("Digite o número de sua opção:");
		System.out.println("1 - Criar Pessoa");
		System.out.println("2 - Criar Aluno");
	}
	
	public static void menuAtualizarPessoaOuAluno() {
		System.out.println();
		System.out.println("Digite o número de sua opção:");
		System.out.println("1 - Atualizar Pessoa");
		System.out.println("2 - Atualizar Aluno");
	}
	
	public static void menuExcluir() {
		System.out.println();
		System.out.println("Digite o número de sua opção:");
		System.out.println("1 - Excluir cadastro de uma Pessoa");
		System.out.println("2 - Excluir cadastro de um Aluno");
	}
}

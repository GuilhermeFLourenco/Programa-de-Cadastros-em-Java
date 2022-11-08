package model;

import util.Contador;

public class Aluno extends Pessoa {
	
	public Double notaFinaldoCurso;
	
	public Aluno(String nome, String tefefone, String datanascimento, Double notaFinaldoCurso, String datacadastro, String dataUltimaAlteracao) {
		super(nome,  tefefone, datanascimento, datacadastro, dataUltimaAlteracao);
		
		this.notaFinaldoCurso = notaFinaldoCurso;
	}

    public Double getNotaFinaldoCurso() {
		return notaFinaldoCurso;
	}


	public void setNotaFinaldoCurso(Double notaFinaldoCurso) {
		this.notaFinaldoCurso = notaFinaldoCurso;
	}


	@Override
	public String toString() {
	     return "Aluno [id=" + id + ", Nome=" + nome + ", Tefefone=" + tefefone + ", Data de nascimento=" + datanascimento
			+ ", " + " Nota final do Curso= " + notaFinaldoCurso + ", Data de cadastro=" + datacadastro + ", Data da ultima alteração= " + dataUltimaAlteracao + "]";
	}

}

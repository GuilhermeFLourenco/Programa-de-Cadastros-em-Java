package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import util.Contador;


public class Pessoa {
	
      public Integer id;
      public String nome;
      public String tefefone;
      public String datanascimento;
      public String datacadastro;
      public String dataUltimaAlteracao;
      

	public Pessoa(String nome, String tefefone, String datanascimento, String datacadastro,
			String dataUltimaAlteracao) {
		this.id = Contador.proximoId();
		this.nome = nome;
		this.tefefone = tefefone;
		this.datanascimento = datanascimento;
		this.datacadastro = datacadastro;
		this.dataUltimaAlteracao = dataUltimaAlteracao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTefefone() {
		return tefefone;
	}

	public void setTefefone(String tefefone) {
		this.tefefone = tefefone;
	}

	public String getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}

	public String getDatacadastro() {
		return datacadastro;
	}

	public void setDatacadastro(String datacadastro) {
		this.datacadastro = datacadastro;
	}


	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", Nome=" + nome + ", Tefefone=" + tefefone + ", Data de nascimento=" + datanascimento
				+ ", Data de cadastro=" + datacadastro + ", Data da ultima alteração= " + dataUltimaAlteracao + "]";
	}

	public String getDataUltimaAlteracao() {
		return dataUltimaAlteracao;
	}

	public void setDataUltimaAlteracao(String dataUltimaAlteracao) {
		this.dataUltimaAlteracao = dataUltimaAlteracao;
	}
	
	
}

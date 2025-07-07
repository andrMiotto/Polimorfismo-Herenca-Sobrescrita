package br.com.AppEscola.model;

public class Aluno extends Pessoa {

	private String serie;

	public Aluno() {
		super();
		this.serie = "";

	}

	public Aluno(String serie) {
		super();
		this.serie = serie;

	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

}

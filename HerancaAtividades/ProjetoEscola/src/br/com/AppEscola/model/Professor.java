package br.com.AppEscola.model;

public class Professor extends Pessoa {

	private String disciplina;

	public Professor() {
		super();
		this.disciplina = "";
	}

	public Professor(String disciplina) {
		super();
		this.disciplina = disciplina;

	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

}

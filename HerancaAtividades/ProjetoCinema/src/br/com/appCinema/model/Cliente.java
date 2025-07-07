package br.com.appCinema.model;

public class Cliente extends Pessoa {
	private String tipoIngresso;

	public Cliente() {
		super();
		this.tipoIngresso = "";
	}

	public Cliente(String nome, String email, String tipoIngresso) {
		super(nome, email);
		this.tipoIngresso = tipoIngresso;
	}

	public String getTipoIngresso() {
		return tipoIngresso;
	}

	public void setTipoIngresso(String tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}
}
package br.com.appDispositivos.model;

public class SmartPhone extends Dispositivo {

	private String SO;

	public SmartPhone(String nome, String SO) {
		super(nome);
		this.SO = SO;
	}

	@Override
	public String toString() {
		return "SmartPhone: " + nome + "\nSistema Operacional: " + SO;
	}
}

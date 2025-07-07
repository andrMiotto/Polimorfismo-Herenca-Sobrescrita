package br.com.appBanco.model;

public class contaPoupanca extends Conta {

	private double taxa;

	public contaPoupanca(int numero, double taxa) {

		super(numero);
		this.taxa = taxa;

	}

	@Override
	public String toString() {
		return "Conta Poupança" + numero + "\nJuros: " + taxa;
	}
}

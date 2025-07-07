package br.com.appBanco.model;

public class ContaCorrente extends Conta {

	private double limiteCheque;

	public ContaCorrente(int numero, double limiteCheque) {
		super(numero);
		this.limiteCheque = limiteCheque;
	}

	@Override
	public String toString() {
		return "Conta Corrente: " + numero + "\nLimite cheque: " + limiteCheque;
	}
}

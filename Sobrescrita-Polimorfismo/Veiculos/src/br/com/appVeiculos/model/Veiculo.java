package br.com.appVeiculos.model;

public class Veiculo {

	protected String marca;

	public Veiculo(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Veiculo: " + marca;
	}
}

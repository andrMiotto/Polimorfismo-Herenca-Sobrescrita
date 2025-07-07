package br.com.appVeiculos.model;

public class Carro extends Veiculo {

	private int numeroPortas;

	public Carro(int numeroPortas, String marca) {
		super(marca);

		this.numeroPortas = numeroPortas;
	}

	@Override
	public String toString() {
		return "Carro: " + marca + "Numero de portas: " + numeroPortas;
	}
}

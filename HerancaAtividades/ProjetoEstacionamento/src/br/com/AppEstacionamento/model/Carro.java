package br.com.AppEstacionamento.model;

public class Carro extends Veiculo {
	private int numeroPortas;

	public Carro() {
		super();
		this.numeroPortas = 0;
	}

	public Carro(String placa, String marca, int numeroPortas) {
		super();
		this.numeroPortas = numeroPortas;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
}
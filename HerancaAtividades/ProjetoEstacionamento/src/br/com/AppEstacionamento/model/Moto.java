package br.com.AppEstacionamento.model;

public class Moto extends Veiculo {
	private int cilindrada;

	public Moto() {
		super();
		this.cilindrada = 0;
	}

	public Moto(String placa, String marca, int cilindrada) {
		super();
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
}
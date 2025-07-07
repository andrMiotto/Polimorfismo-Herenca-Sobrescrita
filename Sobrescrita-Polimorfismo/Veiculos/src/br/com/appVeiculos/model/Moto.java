package br.com.appVeiculos.model;

public class Moto extends Veiculo {

	boolean carenagem;

	public Moto(String marca, boolean carenagem) {
		super(marca);
		this.carenagem = carenagem;
	}

	@Override
	public String toString() {
		return "Moto: " + marca + "Tem carenagem: " + carenagem;
	}

}

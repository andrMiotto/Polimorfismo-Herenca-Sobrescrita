package br.com.appVeiculos;

import java.util.ArrayList;
import java.util.List;
import br.com.appVeiculos.model.*;

public class Main {

	public static void main(String[] args) {

		List<Veiculo> veiculos = new ArrayList<>();

		veiculos.add(new Veiculo("Veiculo generico"));
		veiculos.add(new Carro(4, "Chevette "));
		veiculos.add(new Moto("CG 160 ", true));
		
		
		for (Veiculo vei : veiculos) {
			System.out.println(vei);
		}
	}

}

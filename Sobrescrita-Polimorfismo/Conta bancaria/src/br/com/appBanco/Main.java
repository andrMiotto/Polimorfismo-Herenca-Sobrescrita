package br.com.appBanco;

import java.util.ArrayList;
import java.util.List;

import br.com.appBanco.model.*;

public class Main {

	public static void main(String[] args) {

		List<Conta> contas = new ArrayList<>();
		contas.add(new Conta(0123));
		contas.add(new ContaCorrente(321, 200));
		contas.add(new contaPoupanca(12, 987));

		for (Conta cont : contas) {
			System.out.println(cont);
		}

	}

}

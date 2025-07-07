package br.com.appBiblioteca;

import br.com.appBiblioteca.view.*;
import br.com.appBiblioteca.model.*;
import br.com.appBiblioteca.service.*;

public class Main {

	public static void main(String[] args) {

		Atendente atendente = new Atendente();
		Livro livro = new Livro();

		int opcaoMenuEscolhida;
		do {

			opcaoMenuEscolhida = atendente.menuPrincipal();

			Biblioteca biblioteca = new Biblioteca();

			biblioteca.gerenciarEstoque(opcaoMenuEscolhida, atendente, livro);
		} while (opcaoMenuEscolhida != 0);

	}

}

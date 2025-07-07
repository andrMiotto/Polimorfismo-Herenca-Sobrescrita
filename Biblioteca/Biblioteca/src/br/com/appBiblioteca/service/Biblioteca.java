package br.com.appBiblioteca.service;

import br.com.appBiblioteca.view.*;
import java.util.Scanner;
import br.com.appBiblioteca.model.*;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	List<Livro> biblioteca;

	public Biblioteca() {
		biblioteca = new ArrayList<>();
	}

	public void gerenciarEstoque(int opcaoMenuEscolhida, Atendente atendente, Livro livro) {

		Scanner input = new Scanner(System.in);

		switch (opcaoMenuEscolhida) {

		case 1:
			String nome = atendente.cadastrarNome();
			String autor = atendente.cadastrarAutor();
			int numeroPaginas = atendente.cadastrarNumeroPaginas();

			livro = new Livro(nome, autor, numeroPaginas);

			biblioteca.add(livro);

		case 2:
			 for (Livro livr : biblioteca) {
				 atendente.listar(biblioteca);
			    }		

			break;
		case 3:
			Atendente.removerLivro(biblioteca);

			break;

		case 0:
			System.out.println("Encerrando...");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Encerrando...");

			System.exit(0);
			break;

		}

	}

	public List<Livro> biblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(List<Livro> biblioteca) {
		this.biblioteca = biblioteca;
	}

}

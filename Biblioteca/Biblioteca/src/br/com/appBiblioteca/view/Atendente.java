package br.com.appBiblioteca.view;
import br.com.appBiblioteca.service.*;
import br.com.appBiblioteca.*;
import br.com.appBiblioteca.model.*;

import java.util.List;
import java.util.Scanner;

public class Atendente {

	static Scanner input;

	public Atendente() {

		input = new Scanner(System.in);

	}

	public int menuPrincipal() {
		int opcaoMenu;
		

			 System.out.println("--------Biblioteca Zika--------");
			    System.out.println("");
			    System.out.println("1 - Cadastrar livro");
			    System.out.println("2 - Listar livros");
			    System.out.println("3 - Remover livro");
			    System.out.println("0 - Sair");
			    System.out.println("");
			    
			    System.out.print("-------> ");


			opcaoMenu = input.nextInt();
			input.nextLine();
			if(opcaoMenu < 0 || opcaoMenu > 3) {
			    System.out.println("Codigo invalido");

			}
		 
		return opcaoMenu;

	}

	public String cadastrarNome() {
		System.out.println("Digite o nome");
		
		String nome = input.nextLine();
		return nome;

	}

	public String cadastrarAutor() {
		System.out.println("Digite o autor");
		
		String autor = input.nextLine();
		return autor;

	}

	public int cadastrarNumeroPaginas() {
		System.out.println("Digite o numero paginas");
		int numeroPaginas = input.nextInt();
		return numeroPaginas;

	}
	
	public void listar(List<Livro> biblioteca) {
		
	    if (biblioteca.isEmpty()) {
	        System.out.println("Nenhum livro cadastrado.");
	        return;
	    }
	    else{
	    	System.out.print(biblioteca);
	    }
	    
	}
	public static void removerLivro(List<Livro> biblioteca) {
		
		if (biblioteca.isEmpty()) {
			
			System.out.println("O estoque de livros está vazio.");
			return;
		}
		
		System.out.println("Livros disponíveis:");
		
		for (int i = 0; i < biblioteca.size(); i++) {
			
			System.out.println((i + 1) + " - " + biblioteca.get(i).getNome());
			
		}

		System.out.println("Digite o número do livro que deseja remover: ");
		
		System.out.print("> ");
		
		int escolha = input.nextInt();
		input.nextLine();
		
		System.out.println("--------------------------");
		
		if (escolha > 0 && escolha <= biblioteca.size()) {
			
			Livro removido = biblioteca.remove(escolha - 1);
			System.out.println("Livro '" + removido.getNome() + "' removido com sucesso!");
			
		} else {
			
			System.out.println("Opção inválida. Escolha um número entre 1 e " + biblioteca.size() + ".");
			
		}
	}

	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}
	
	

}

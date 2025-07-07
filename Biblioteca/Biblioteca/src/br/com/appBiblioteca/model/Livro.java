package br.com.appBiblioteca.model;

public class Livro {

	private String nome;
	private String autor;
	private int numeroPaginas;

	public Livro() {
		this.setNome("");
		this.setAutor("");
		this.setNumeroPaginas(0);

	}

	public Livro(String nome, String autor, int numeroPaginas) {
		this.setNome(nome);
		this.setAutor(autor);
		this.setNumeroPaginas(numeroPaginas);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int GetNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	
   
}

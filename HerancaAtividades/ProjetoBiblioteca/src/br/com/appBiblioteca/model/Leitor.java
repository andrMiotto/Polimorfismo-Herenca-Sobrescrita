package br.com.appBiblioteca.model;

public class Leitor extends Pessoa {
    private String matricula;

    public Leitor() {
        super();
        this.matricula = "";
    }

    public Leitor(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
} 
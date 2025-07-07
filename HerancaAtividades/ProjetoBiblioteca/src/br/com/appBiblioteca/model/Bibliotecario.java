package br.com.appBiblioteca.model;

public class Bibliotecario extends Pessoa {
    private String turno;

    public Bibliotecario() {
        super();
        this.turno = "";
    }

    public Bibliotecario(String nome, String cpf, String turno) {
        super(nome, cpf);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
} 
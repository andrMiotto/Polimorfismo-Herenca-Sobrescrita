package br.com.appClinica.model;


public class Paciente extends Pessoa {
    private String planoSaude;

    public Paciente() {
        super();
        this.planoSaude = "";
    }

    public Paciente(String nome, String telefone, String planoSaude) {
        super();
        this.planoSaude = planoSaude;
    }

    public String getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }
} 
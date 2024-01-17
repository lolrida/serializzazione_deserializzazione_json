package com.example;

public class Studenti {
    private String nome;
    private String cognome;
    private String dataNascita;

    public Studenti(){
        this.nome = "Rida";
        this.cognome = "Carola";
        this.dataNascita = "02/04/2005";
    }

    
    

    public String getNome(){
        return this.nome;
    }
    public String getCognome(){
        return this.cognome;
    }
    public String getDataNascita(){
        return this.dataNascita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




    public void setCognome(String cognome) {
        this.cognome = cognome;
    }




    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }




    @Override
    public String toString() {
        String s = "Nome: " + nome + "| Cognome: " + cognome + "| Data di nascita: " + dataNascita;
        return s;
    }

    
}

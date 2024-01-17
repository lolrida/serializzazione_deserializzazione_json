package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.xml.crypto.Data;

public class Studenti {
    private String nome;
    private String cognome;
    private Data dataNascita;

    public Studenti(){
        this.nome = "Rida";
        this.cognome = "Carola";
        try {
            this.dataNascita = (Data) new SimpleDateFormat("dd/MM/yyyy").parse("02/04/2005");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    
    

    public String getNome(){
        return this.nome;
    }
    public String getCognome(){
        return this.cognome;
    }
    public Data getDataNascita(){
        return this.dataNascita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




    public void setCognome(String cognome) {
        this.cognome = cognome;
    }




    public void setDataNascita(Data dataNascita) {
        this.dataNascita = dataNascita;
    }




    @Override
    public String toString() {
        String s = "Nome: " + nome + "| Cognome: " + cognome + "| Data di nascita: " + dataNascita;
        return s;
    }

    
}

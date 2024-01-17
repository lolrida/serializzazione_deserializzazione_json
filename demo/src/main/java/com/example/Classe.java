package com.example;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Classe {
    String numero;
    String sezione;
    String aula;
    ArrayList<Studenti> alunni;

    public Classe(String numero, String sezione, String aula, ArrayList<Studenti> alunni) {
        this.numero = numero;
        this.sezione = sezione;
        this.aula = aula;
        this.alunni = alunni;
    }

    public Classe(){

    }

    public void addStudente(Studenti studente) {
        alunni.add(studente);
    }

    public ArrayList<Studenti> getListaalunni() {
        return alunni;
    }

    @Override
    public String toString(){
        String s;
        s = "Classe: " + numero + "| Sezione: " + sezione + "| Aula: " + aula + "| Alunni: " + alunni.toString();
        return s;
    }

     
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSezione() {
        return sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public ArrayList<Studenti> getAlunni() {
        return alunni;
    }

    public void setAlunni(ArrayList<Studenti> alunni) {
        this.alunni = alunni;
    }

    




   
}
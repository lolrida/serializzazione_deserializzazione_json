package com.example;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Classe {
    String classe;
    String indirizzo;

    ArrayList<Studenti> studenti;

    public Classe(String classe, String indirizzo, ArrayList<Studenti> studenti) {
        this.classe = classe;
        this.indirizzo = indirizzo;
        this.studenti = studenti;
    }

    public void addStudente(Studenti studente) {
        studenti.add(studente);
    }

    public ArrayList<Studenti> getListaStudenti() {
        return studenti;
    }

    @Override
    public String toString(){
        String s;
        s = "Classe: " + classe + "| Indirizzo: " + indirizzo + "| Studenti: " + studenti.toString();
        return s;
    }


   
}
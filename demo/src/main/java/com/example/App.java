package com.example;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            System.out.println("server started and executing");
            ServerSocket server = new ServerSocket(3000);

            Socket socket = server.accept();
            BufferedReader in  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            ArrayList<Studenti> studenti = new ArrayList<Studenti>();

            /*
             * Come serializzare e deserializzare un oggetto in XML
             * 
             * Serializzare (va fatto nel server): 
             *  - prendere un oggetto e trasformarlo in una stringa : 
             *      XmlMapper xmlMapper = new XmlMapper();
             *      String s = xmlMapper.writeValueAsString(studente);
             *      System.out.println(s);
             * 
             * Deserializzare (va fatto nel client): 
             *  - prendere una stringa e trasformarla in un oggetto :
             *      Alunno a = xmlMapper.readValue(s, Alunno.class);
             *      System.out.println(a.nome);
             *      System.out.println(a.cognome);
             * 
             * ---------------------------------------------------------------------------------------------------------------
             * 
             * Come serializzare e deserializzare un oggetto in JSON
             * 
             * Serializzare (va fatto nel server): 
             *  - prendere un oggetto e trasformarlo in una stringa : 
             *      ObjectMapper ObjectMapper = new ObjectMapper();
             *      String s = ObjectMapper.writeValueAsString(studente);
             *      System.out.println(s);
             * 
             * Deserializzare (va fatto nel client): 
             *  - prendere una stringa e trasformarla in un oggetto :
             *      Alunno a = ObjectMapper.readValue(s, Alunno.class);
             *      System.out.println(a.nome);
             *      System.out.println(a.cognome);
             * 
             * 
             * 
             * 
             * 
             */
            
            
            
            Studenti studente = new Studenti();
            studenti.add(studente);
            Classe classe = new Classe("5", "CIA", "04-TW", studenti);

            ObjectMapper objectMapper = new ObjectMapper();
            String s = objectMapper.writeValueAsString(classe);

            out.writeBytes(s + "\n");

            

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error during server instance");
            System.exit(1);
        }
    }
}

    

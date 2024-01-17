package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 3000);

            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            ObjectMapper objectMapper = new ObjectMapper();
            String s = in.readLine();
            Classe c = objectMapper.readValue(s, Classe.class);
            System.out.println(c);
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {
    
    public static void main(String[] args) throws UnknownHostException, IOException {
        System.out.println("client partito");
        Socket client= new Socket("localhost",3000);
        BufferedReader in= new BufferedReader(new InputStreamReader(client.getInputStream()));
        DataOutputStream out=new DataOutputStream(client.getOutputStream());
        String stringaMinuscola="ciao";
        out.writeBytes(stringaMinuscola+'\n');
        String stringaRicevuta=in.readLine();
        System.out.println("stringa minuscola "+stringaRicevuta);
        System.out.println("client terminato");
    }
}
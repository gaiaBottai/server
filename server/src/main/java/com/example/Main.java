package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("server partito...");
        ServerSocket server= new ServerSocket(3000);
        Socket miosocket=server.accept();
        BufferedReader in= new BufferedReader(new InputStreamReader(miosocket.getInputStream()));
        DataOutputStream out=new DataOutputStream(miosocket.getOutputStream());
        String stringaRicevuta=in.readLine();
        System.out.println(stringaRicevuta+"questa e' la stringa ricevuta");
        String stringaMaiuscola=stringaRicevuta.toUpperCase();
        out.writeBytes(stringaMaiuscola);
        miosocket.close();
        server.close();
        System.out.println("ciao a tutti");
        
    }
}
package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
//client
public class Main {
    
    public static void main(String[] args) throws UnknownHostException, IOException {
        Scanner scanner = new Scanner(System.in);
         
    Socket client= new Socket("localhost",3000);
    BufferedReader in= new BufferedReader(new InputStreamReader(client.getInputStream()));
    DataOutputStream out=new DataOutputStream(client.getOutputStream());
    String stringaMinuscola;
    do{

        System.out.println("client partito");
        stringaMinuscola = scanner.nextLine(); 
        out.writeBytes(stringaMinuscola+'\n');
        
        String stringaRicevuta=in.readLine();
        System.out.println(stringaRicevuta);
        
    }while(!stringaMinuscola.equals("!"));
        System.out.println("client terminato");
    }
}
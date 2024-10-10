package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Main {
    public static void main(String[] args) throws IOException {
       

           
           ServerSocket server= new ServerSocket(3000);
           Socket miosocket=server.accept();
           
           BufferedReader in= new BufferedReader(new InputStreamReader(miosocket.getInputStream()));
           DataOutputStream out=new DataOutputStream(miosocket.getOutputStream());
           System.out.println("server partito...");
           String stringaRicevuta;
           do{

               stringaRicevuta=in.readLine();
               if(stringaRicevuta.equals("!"))
               {
                miosocket.close();
                server.close();
                System.out.println("server terminato");
               }
               System.out.println(stringaRicevuta);
               String stringaMaiuscola=stringaRicevuta.toUpperCase();
               out.writeBytes(stringaMaiuscola);
            }while(!stringaRicevuta.equals("!"));
           
           
          
    }
        
        
        
}

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*
             Escribe un programa que permita introducir a través del teclado tres números
             e imprimirlos en orden inverso a su lectura.
        */

         int a, b,c;
        try (BufferedReader br = new BufferedReader (new InputStreamReader (System.in))) {
            System.out.println ("Inserte el primer numero : ");
            a = Integer.parseInt (br.readLine ());

            System.out.println ("Inserte el segundo numero : ");
            b = Integer.parseInt (br.readLine ());

            System.out.println ("Inserte el Tercero numero : ");
            c = Integer.parseInt (br.readLine ());

            System.out.println ("Orden inverso : "+c + " , " +b+ " , " + a);
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}

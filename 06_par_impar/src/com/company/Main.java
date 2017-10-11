package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /*
       Nombre : Miguel Bruno
       Apellidos : Obiang Mitogo Nchama
     */

    public static void main(String[] args) throws IOException {
	// recibir datos del teclado

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

            // crear variable
           int num;

        System.out.println (" Dame un numero :");

        num = Integer.parseInt (br.readLine ());

        if (num%2 == 0){
            System.out.println ("PAR");
    } else {
            System.out.println ("Impar");
        }
    }
}

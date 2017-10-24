package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// Haz un programa que pida al usuario un valor y calcule el cuadrado de dicho valor, sin utilizar multiplicaciones.

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        int valor,cuadrado=0;

        System.out.print (" Dame un valor : ");
        valor = Integer.parseInt (br.readLine ());

                   for(int i=0;i<valor;i++){
                       cuadrado=cuadrado+valor;
                   }
        System.out.println ("El cuadrado de : "+valor+" es "+cuadrado);


    }
}


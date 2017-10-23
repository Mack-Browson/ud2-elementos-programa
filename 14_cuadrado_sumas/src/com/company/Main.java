package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// Haz un programa que pida al usuario un valor y calcule el cuadrado de dicho valor, sin utilizar multiplicaciones.

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        int valor,rep,total=0;



        System.out.print (" Dame un valor : ");
        valor = Integer.parseInt (br.readLine ());

        for (rep=0; rep<valor;rep= rep++){

            total = total+valor;
            System.out.println (" El cuadrador de "+valor+ " es : "+total);
        }


    }
}

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
       Nombre : Miguel Bruno
       Apellido : Obiang Mitogo Nchama
     */
    public static void main(String[] args) throws IOException {
	// Un programa que calcule el factorial de un numero

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        System.out.print (" Escriba un numero : ");
        int numero = Integer.parseInt (br.readLine ());
        int factorial = 1;
      while (numero!=0){
          factorial = factorial*numero;
          numero--;
      }
        System.out.println ("factorial : "+factorial);

    }
}

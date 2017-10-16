package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /*
     Nombre: Miguel Bruno
     Apellido: Obiang Mitogo Nchama
     
     */
    public static void main(String[] args) throws IOException {
	// Escribe un programa que pida al usuario una temperatura en grados centígrados y una letra (F o K).

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        int temp;
        char letra;

        System.out.print (" Dame la temperatura : ");
        temp = Integer.parseInt (br.readLine ());

        System.out.print (" dame una letra F o K : ");
        letra = br.readLine ().charAt (0);

        if(letra == 'f'){
           double F = (9/5)*temp +32;
            System.out.print ("se ha convertido a Fahrenheit : "+ F);
        } else {
            double K = temp + 273.15;
            System.out.print ("De Celsius a Kevin "+K);
        }

    }
}

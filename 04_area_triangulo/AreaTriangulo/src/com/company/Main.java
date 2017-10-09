package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        /*
               Escribe un programa que, dada la base y la altura de un triángulo, calcule el área.
         */
	// Creacion de variables

        double base,altura, area;

        // Leer desde el teclado
        try (BufferedReader br = new BufferedReader (new InputStreamReader (System.in))) {

            System.out.println ("dame la base del triangulo : ");
            base = Integer.parseInt (br.readLine ());

            System.out.println (" Podrias darme la altura : ");
            altura = Integer.parseInt (br.readLine ());

               // Procedemos a calcular el Area del triangulo

            area = (base*altura)/2;

            System.out.print(" El area del triangulo segun los datos es : " +area);

        } catch (IOException e) {
            e.printStackTrace ();
        }

    }
}

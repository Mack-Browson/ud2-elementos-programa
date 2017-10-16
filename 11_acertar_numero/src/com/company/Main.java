package com.company;

import jdk.nashorn.internal.ir.IdentNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    /*
         Nombre: Miguel Bruno
         Apellido: Obiang Mitogo Nchama
     */
    public static void main(String[] args) throws IOException {
	// Crea un minijuego en el que el ordenador
        // elija un número aleatorio comprendido entre 0 y 100 para que el usuario intente adivinarlo.


        // insertar dato desde el teclado

        BufferedReader rb = new BufferedReader (new InputStreamReader (System.in));
        // Para generar numeros aleatorios
        Random r = new Random ();
        int aleatorio =r.nextInt (100);
        String respuesta = rb.readLine ();
        // crear variables
        int numero, contador = 0;

        System.out.print(" Podrias darme un numero que esté entre 1 y 100");

        numero = Integer.parseInt (rb.readLine ());

        while (numero != aleatorio && respuesta.equals ("FIN")) {
            numero = Integer.parseInt (respuesta);
            if (numero == aleatorio) {
                System.out.println (" Eres el amo pana Acertaste a la primera");
            } else if (numero > aleatorio) {
                System.out.println (" El numero que has introducido es mayor, podrias buscar uno menor");
            }

            contador++;
            numero = Integer.parseInt (rb.readLine ());
        }


    }
}

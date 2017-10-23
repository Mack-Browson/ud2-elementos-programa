package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // Haz un programa que muestre los 100 primeros números pares o impares, dependiendo de lo que elija el usuario.

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int num=1;


        System.out.println (" Elije una opcion PAR O IMPAR");
        String eleccion = br.readLine ();

        if(eleccion.equals ("PAR") || eleccion.equals ("IMPAR")) {

            if (num == 2 || num == 1){
                for (int i = 0; i < 100; i++) {

                    if (num % 2 == 0) {
                        System.out.println ("Pares : " + num);
                    } else {
                        System.out.println ("Impares : " + num);
                    }

                    num = num + 2;
                }
            }
            }
        }
    }


package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /*
       Nombre : Miguel Bruno
       Apellidos : Obiang Mitogo Nchama
     */

    public static void main(String[] args) throws IOException {
	/*
	   Introducir por teclado un número comprendido entre el 1 y el 7
	   e imprimir el día de la semana al que hace referencia.
	 */
        // Recibir datos por teclado
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        // Creacion de variables
        int dia;

        System.out.print ("Introdusca un valor : ");
        dia = Integer.parseInt (br.readLine ());

        if (dia >= 1 && dia <= 7) {

            // Casos multiples
            switch (dia) {

                case 1:
                    System.out.println ("Lunes");

                    break;
                case 2:
                    System.out.println ("Martes");
                    break;
                case 3:
                    System.out.println ("Miercoles");
                    break;
                case 4:
                    System.out.println ("Jueves");
                    break;
                case 5:
                    System.out.println ("Viernes");
                    break;
                case 6:
                    System.out.println ("Sabado");
                    break;
                case 7:
                    System.out.println ("Domingo");
                    break;
                default:
                    System.out.println ("Lo siento el numero no es correcto");
                    break;
            }


        }  else{
            System.out.println ("El valor introducido no es correcto");
        }
    }
}
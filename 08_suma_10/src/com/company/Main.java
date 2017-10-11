package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
       Nombre: Miguel Bruno
       Apellido : Obiang Mitogo Nchama
     */

    public static void main(String[] args) throws IOException {
        // Entrada de datos desde el teclado
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        // creacion de varibles para la suma

        int i;
        int num, s = 0;

            for (i = 0; i < 10; i++) {
                System.out.println (" dame un numero : ");
                num = Integer.parseInt (br.readLine ());
                s = s + num;
                System.out.println (" La suma es : " + s);
            }
        }
    }

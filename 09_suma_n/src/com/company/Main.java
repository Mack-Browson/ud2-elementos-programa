package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        // Entrada de datos desde el teclado
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        // creacion de varibles para la suma

        int i;
        int num, s = 0;
        System.out.println (" Cual es la cantidad de numeros que quiere sumar");
        num = Integer.parseInt (br.readLine ());

        for (i = 0; i < num; i++) {
            System.out.println (" dame un numero : ");
            num = Integer.parseInt (br.readLine ());
            s = s + num;
            System.out.println (" La suma es : " + s);

        }
    }
}

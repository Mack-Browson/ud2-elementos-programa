package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Escribe un programa que muestre el resultado de multiplicar dos números introducidos por teclado.
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int m;
            System.out.println("Introduce el primer numero: ");
            int num1 =Integer.parseInt (br.readLine());

            System.out.println ("Introduce el segundo number: ");
            int num2 = Integer.parseInt (br.readLine ());

            m = num1*num2;
            System.out.println ("Mostrar la multiplicacion: "+m);


        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}

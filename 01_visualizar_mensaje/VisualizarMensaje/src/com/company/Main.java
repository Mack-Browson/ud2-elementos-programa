package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Escribe un programa que visualice por pantalla un mensaje introducido por teclado.

        System.out.println(" Que deseas decirme");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String dime = br.readLine();
            System.out.println("Mensaje enviado : "+dime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

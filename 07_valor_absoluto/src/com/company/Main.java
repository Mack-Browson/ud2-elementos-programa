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
	// Recibir datos en el teclado

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        // Crear variable
        int num;
        int absNum;


        do{
            System.out.print (" Introdusca un valor numerico : ");
            num = Integer.parseInt (br.readLine ());
            absNum = Math.abs (num);
            System.out.println ("El valor absoluto de:" + num+ "es : " + absNum);
        } while(!(num == 0));


    }
}

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/*
      Haz un programa que pida al usuario valores numéricos hasta que el usuario escriba FIN.

      El programa irá sumando esos valores y cuando termine, mostrará la suma total, el máximo y el mínimo
       de los valores leídos.
	 */

        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int numero, Stotal=0,max,min;
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        String respuesta= "";

        do{
            respuesta = br.readLine ();
            if (!respuesta.equals ("FIN")) {
                numero = Integer.parseInt (respuesta);

                Stotal = Stotal+numero;

                if (numero>max){
                    max = numero;
                }else if (numero< min){
                    min = numero;
                }
            }


        }while (!respuesta.equals ("FIN")  );

        System.out.println (" Suma total : "+Stotal);
        System.out.println ("Maximo : "+max);
        System.out.println (" Minimo : "+min);
    }
}

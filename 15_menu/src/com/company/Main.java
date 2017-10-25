package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
        int num1,num2;

        System.out.println ("dame num1 : ");
        String entrada=br.readLine ();
        num1=Integer.parseInt (entrada);

        System.out.println ("dame num2 :");
        num2=Integer.parseInt (br.readLine ());

        System.out.println (" a) Suma \n" +
                " b) Resta\n" +
                " c) Multiplicación\n" +
                " d) Division \n" +
                " e) Resto \n"+" f) Terminar"
                );


        String opcion = br.readLine ();

       
        switch (opcion){

            case "a" :
                int Suma = num1+num2;
                System.out.println (" Suma : "+Suma);
                break;
            case "b":
                int Resta = num1-num2;
                System.out.println (" Resta : "+Resta);
                break;
            case "c":
                int Multiplicacion = num1*num2;
                System.out.println ("Multiplicacion : "+Multiplicacion);
                break;
            case "d":
                int div = num1/num2;
                System.out.println ("Division : "+div);
                break;
            case "e":
                int resto = num1%num2;
                System.out.println ("Resto : "+resto);
                break;


        }


    }
}

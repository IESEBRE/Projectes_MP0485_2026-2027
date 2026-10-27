package org.example.exercicis;

public class Exercici12Tris {

    static void main(String[] args) {
        //Declaració de variables
        int numero, sumaDivisors=0;

        //Demanem el número a l'usuari
        do {
            numero = Integer.parseInt(IO.readln("Introduix un enter major que 1: "));
            if (numero > 1) break;
            else IO.println("Ha de ser major que 1!!");
        }while(true);

        //Bucle que trobe els divisors
        for(int divisor=1; divisor<numero;divisor++){
            if(numero%divisor==0){
                sumaDivisors+=divisor;
            }
        }

        if(numero==sumaDivisors) IO.println("És perfecte.");
        else  IO.println("No és perfecte.");

    }

}

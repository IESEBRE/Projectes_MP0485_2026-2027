package org.example.exercicis;

public class Exercici12Bis {

    static void main(String[] args) {
        //Declaració de variables
        int numero;

        //Demanem el número a l'usuari
        numero=Integer.parseInt(IO.readln("Introduix un enter: "));

        //Bucle que trobe els divisors
        for(int divisor=1; divisor<=numero;divisor++){
            if(numero%divisor==0){
                IO.println(divisor);
            }
        }

    }

}

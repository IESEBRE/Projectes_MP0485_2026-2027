package org.example.exercicis;

public class Exercici12 {

    static void main(String[] args) {
        //Declaració de variables
        int numero, divisor=2;
        boolean primerDivisor=true; //per saber si he de posar l'asterisc o no

        //Demanem el número a l'usuari
        numero=Integer.parseInt(IO.readln("Introduix un enter: "));

        //Començo a escriure la solució
        IO.print(numero +" = ");

        //Bucle que trobe els factors primers
        do{
            if(numero%divisor==0){
                if(primerDivisor) IO.print(divisor);
                else IO.print(" * " + divisor);
                primerDivisor=false;
                numero/=divisor;
            }else divisor++;

        }while(numero!=1);

    }

}

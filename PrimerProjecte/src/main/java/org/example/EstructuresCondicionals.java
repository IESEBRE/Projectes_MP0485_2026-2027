package org.example;

public class EstructuresCondicionals {


    void main(){
        //Declaració de variables
        int numero;

        //Li dic a l'usuari que escrigue un número enter
        numero=Integer.parseInt(IO.readln("Introduix un número enter:"));

        //Estructura condicional if(condició){ instruccions } --> les instruccions s'executaran si la condició és certa (true)
        if( numero > 0){
            IO.println("El número introduït és positiu!!");                 //1 sola instrucció en {}
        }
        if( numero > 0) IO.println("El número introduït és positiu!!");     //1 sola instrucció sense {}

        if( numero > 0){
            IO.println("El número introduït és positiu!!");                 //2 instruccions en {}, no es pot sense
            IO.print("Que tingues un bon dia!!");
        }

        if( numero > 0)
            IO.println("El número introduït és positiu!!");                 //1 instruccions sense {}
        IO.println("Que tingues un bon dia!!");                               //1 instrucció qwue NO pertany a l'if

        //Coses que NO podem fer
        //if(numero) System.out.println("Hola");  --> no pñodem posar una expressió no booleana com a condició
        boolean esDimarts=true;
        if(esDimarts) System.out.println("Que tingues un bon dimarts!!");
        if(esDimarts==true) System.out.println("Que tingues un bon dimarts!!"); //en variables booleanes no cal usar comparacions

        //Posar unes intruccions usant 1 o més ifs que mostren un missatge diferent si avui és dimarts o no --> sempre
        // s'executarà 1 i només 1 instrucció
        if(esDimarts) System.out.println("Que tingues un bon dimarts!!");
        if(!esDimarts) System.out.println("Que tingues un bon dia!!");

    }






}

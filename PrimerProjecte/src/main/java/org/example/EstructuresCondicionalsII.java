package org.example;

public class EstructuresCondicionalsII {

    void main(){
        //Declaració de variables
        boolean esDimarts=true;

        //Posar unes intruccions usant 1 o més ifs que mostren un missatge diferent si avui és dimarts o no --> sempre
        // s'executarà 1 i només 1 instrucció
        if(esDimarts) System.out.println("Que tingues un bon dimarts!!");
        if(!esDimarts) System.out.println("Que tingues un bon dia!!");

        //Si tenim 2 ifs consecutius on la condició és la negació de la del primer  --> if else
        if(esDimarts) System.out.println("Que tingues un bon dimarts!!");
        else System.out.println("Que tingues un bon dia!!");
        //o
        if(!esDimarts) System.out.println("Que tingues un bon dia!!");
        else System.out.println("Que tingues un bon dimarts!!");

        if(esDimarts){
            System.out.println("Que tingues un bon dimarts!!");
            System.out.println("Que tingues un bon curs!!");
        }
        else System.out.println("Que tingues un bon dia!!");

        if(esDimarts)
            System.out.println("Que tingues un bon dimarts!!");
        else{
            System.out.println("Que tingues un bon dia!!");
            System.out.println("Que tingues un bon curs!!");
        }

        if(esDimarts){
            System.out.println("Que tingues un bon dimarts!!");
            System.out.println("Que tingues un bon curs!!");
        }
        else {
            System.out.println("Que tingues un bon dia!!");
            System.out.println("Esperem que sigue mínim dimecres!!");
        }


    }
}

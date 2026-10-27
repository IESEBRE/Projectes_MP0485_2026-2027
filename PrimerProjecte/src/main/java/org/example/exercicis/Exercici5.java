package org.example.exercicis;

public class Exercici5 {

    void main(){
        //Declaració de variables
        double pes;
        int compt=0;

        do{
            //Llegim un pes de pizza
            pes=Double.parseDouble(IO.readln("Introduix un pes de pizza (0.0 per acabar): "));

            //Si el pes és 0 sortim del bucle
            if(pes==0) break;

            //El comptem si no és negatiu ni zero
            if(pes>0) compt++;

            //En qualsevol cas mostrem el pes en els 4 formats demanats
            IO.println(String.format("%+10.2f", pes));
            IO.println(String.format("%+010.2f", pes));
            IO.println(String.format("%E", pes));
            IO.println(String.format("%g", pes));
        }while(true);

        //Mostrem la quantitat de pizzes introduides
        IO.println(String.format("S'han introduït %d pizzes.", compt));



    }



}

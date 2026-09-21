package org.example;

public class ContincVariables {
    void main() {
        //Zona de declaració de variables del programa
        //tipo nom;
        int dia=21;             //variable entera inicialitzada a 21
        String nomPila;         //variable String NO inicialitzada

        //El nom de les variables usa notació camelCase


        //Ara inicialitzem el valor de la variable String
        nomPila="Santi";

        //Ara modifico el dia
        dia=22;

        //Mostrem el valor de les variables pel terminal
        IO.println("Demà serà el "+dia+" de setembre de 2026");
        IO.println("Me dic "+nomPila);
        //IO.println(bondia);  --> error ja que no tinc res en este nom

    }
}

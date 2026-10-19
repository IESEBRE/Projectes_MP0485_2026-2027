package org.example.exercicis;

public class Exercici3 {

    void main(){
        //Forcem a l'usuari
        int any;

        do{
            any=Integer.parseInt(IO.readln("Escriu un any >= 1582: "));
            if( any<1582 ) IO.println("Ha de ser superior o igual que el 1582!!");
            else break;
        }while(true);

        //Mostrem el missatge segons si l'any és no de traspàs
        if( any % 4 == 0 && any % 100 !=0 || any % 400 == 0 ) IO.println("Sí, és bixest");
        else IO.println("No, és bixest");

    }



}

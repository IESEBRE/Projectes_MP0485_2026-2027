package org.example;

import java.util.Scanner;

public class LecturaDades {

    void main(){
        //Declaració de variables
        String text=new String("Hola");     //String és especial i permet instanciar sense posar el new (excepció)

        int numero=25;                              //els tipos primitius només tenen un valor i no poden usar el new

        //Versió clàssica --> classe Scanner
        Scanner entrada = new Scanner(System.in);   //instanciem un nou objecte de la classe Scanner

       //Anem a llegir un text del teclat
       IO.println("Introduix el teu nom (acabat en INTRO):");
       text=entrada.nextLine();

       IO.println("Introduix la teua edat:");
       numero=entrada.nextInt();

       IO.println("Te dius "+text+" i tens "+numero+" anys.");

    }





}

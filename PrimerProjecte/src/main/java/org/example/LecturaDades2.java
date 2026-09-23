package org.example;


public class LecturaDades2 {

    void main(){
        //Declaració de variables
        String text=new String("Hola");     //String és especial i permet instanciar sense posar el new (excepció)

        int numero=25;                              //els tipos primitius només tenen un valor i no poden usar el new

        //Versió nova --> classe IO

       //Anem a llegir un text del teclat
       IO.println("Introduix el teu nom (acabat en INTRO):");
       text=IO.readln();                                        //readln posant un IO.println(...) previ

       //text=IO.readln("Introduix el teu nom (acabat en INTRO):");  //readln SENSE un IO.println(...) previ

       //La classe IO no té un mètode per llegir enters, només per textos, per tnat hem de trnsformar el text a enter
       numero=Integer.parseInt(IO.readln("Introduix la teua edat:"));

       IO.println("Te dius "+text+" i tens "+numero+" anys.");

    }





}

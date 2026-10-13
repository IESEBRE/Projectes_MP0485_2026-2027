package org.example.repetitives;

public class EstructuresRepetitives {


    void main(){

        //Declaració de variables
        int n=10;

        //Bucle que mostra el valor de la variable
        while(n>=0){
            IO.println(n);
            n--;
        }

        n=10;
        //Bucle com el de dalt però utilitzant la sentència break;
        while(true){
            IO.println(n);
            n--;
            //La condició és per sortir, per tant és la negació de la de dalt
            if(n<0) break;
        }
        /*
        Les instruccions del cos del while s'executen si la condició és certa.
        Dins del cos ha d'haver-hi instruccions que canvien la condició de manera que sigue falsa en algun moment -->
        sinó tindrem un bucle infinit
        while(condició){
            cos
        }
        */



    }

}

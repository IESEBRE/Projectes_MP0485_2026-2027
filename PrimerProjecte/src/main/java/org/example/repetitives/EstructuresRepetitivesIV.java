package org.example.repetitives;

public class EstructuresRepetitivesIV {

    void main(){
        //3ª estructura --> el bucle for, conté el control del bucle a la capçalera
        /*
        for(inicialització; condició; actualització){
                //Cos del bucle
        }
         */

        //Bucle que mostra els valors de 1 al número positiu introduit per l'usuari
        /*
        int numero=Integer.parseInt(IO.readln("Escriu un número enter positiu (>0): "));
        {
            int i=1;
            while(i<=numero){
                IO.println(i);
                i++;
            }
        }
        */
        int numero=Integer.parseInt(IO.readln("Escriu un número enter positiu (>0): "));

        for( int i=1 ; i<=numero ; i++){
            IO.println(i);
        }


        //Un altre for nou
        for(int i=7, j=36;i<100 && j%4==0; i++, j--){
            IO.println(i+j*56%4);
        }

    }

}

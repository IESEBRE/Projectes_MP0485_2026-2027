package org.example.repetitives;

public class EstructuresRepetitivesII {

    void main(){
        //Declaració de variables
        int nFiles, copiaNFiles,
                numAsteriscos=1;    //diu quants * escric a cada fila

        //Demanem al l'usuari quantes files vol mostrar
        nFiles=copiaNFiles=Integer.parseInt(IO.readln("Quantes files vols mostrar?: "));
        nFiles=nFiles*2-1;                  //modifico el número de files per la nova figura

        //Bucle per dibuixar la figura
        while(nFiles>0){

            //Dibuixem la fila actual tenint en compte el valor de numAsteriscos
            int nCols=1;                    //declarada dins del bloc del while
            while (nCols<=numAsteriscos){
                IO.print("* ");
                nCols++;
            }
            //Depenent d'una condició incrementem o decrementem els asteriscos a dibuixar --> les primers nFiles mostrem més asteriscos
            //i les segones menys
            if(nFiles>copiaNFiles)
                //Incremento el numAsteriscos
                numAsteriscos++;
            else
                //Decremento el numAsteriscos
                numAsteriscos--;

            //Decrementem el comptador de files per evitar el bucle infinit
            nFiles--;
            //Poso un salt de línia per a que mostre cada fila al seu lloc
            IO.println();
        }

        //nCols++;      --> no la puc usar fora del bloc on està declarada

    }

}

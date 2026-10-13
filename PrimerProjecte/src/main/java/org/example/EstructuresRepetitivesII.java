package org.example;

public class EstructuresRepetitivesII {

    void main(){
        //Declaració de variables
        int nFiles,
                numAsteriscos=1;    //diu quants * escric a cada fila

        //Demanem al l'usuari quantes files vol mostrar
        nFiles=Integer.parseInt(IO.readln("Quantes files vols mostrar?: "));

        //Bucle per dibuixar la figura
        while(nFiles>0){

            //Dibuixem la fila actual tenint en compte el valor de numAsteriscos
            int nCols=1;                    //declarada dins del bloc del while
            while (nCols<=numAsteriscos){
                IO.print("* ");
                nCols++;
            }
            //Incremento el numAsteriscos
            numAsteriscos++;

            //Decrementem el comptador de files per evitar el bucle infinit
            nFiles--;
            //Poso un salt de línia per a que mostre cada fila al seu lloc
            IO.println();
        }

        //nCols++;      --> no la puc usar fora del bloc on està declarada

    }

}

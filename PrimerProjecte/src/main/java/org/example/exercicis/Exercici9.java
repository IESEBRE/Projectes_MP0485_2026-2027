package org.example.exercicis;

public class Exercici9 {

    void main(){
        //Declaració de variables
        int n,m;
        int suma=0, comptador=0, producte=1;

        //Usem do while ja que hem de llegir els 2 valors com a mínim
        do{
            //Llegim la parella de valors enters
            n=Integer.parseInt(IO.readln("Escriu el primer dels 2 valors enters: "));
            m=Integer.parseInt(IO.readln("Escriu el segon dels 2 valors enters: "));

            //Fem els càlculs demanats
            suma+=n+m;
            comptador+=2;
            if(n!=0) producte*=n;
            if(m!=0) producte*=m;
        }while(n!=m && n!=0 && m!=0);

        //Mostrem el resultat
        System.out.format("Suma: %d Mitjana: %f Producte: %d%n", suma, (double)suma/comptador, producte);
    }


}

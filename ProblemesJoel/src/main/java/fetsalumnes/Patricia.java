package fetsalumnes;

import java.util.Scanner;

public class Patricia {

    void main(){
        //Declaració de variables
        Scanner ent=new Scanner(System.in);
        int numCasos=ent.nextInt();

        //Bucle per tractar cada cas
        while(numCasos>0){
            //Tractar cas actual
            int d=ent.nextInt();            //dies que falten per acabar l'any
            int n=ent.nextInt();            //libres que li queden per llegir
            int suma=0;                     //total de pàgines que li queden per llegir

            //Creem un bucle per llegir la segona línia
            while(n>0){
                suma+=ent.nextInt();        //sumen les pàgines que li queden per llegir
                n--;
            }

            //El resultat dependrà de quantes pàgines ha de llegir per dia abans de que acabe l'any actual
            double paginesPerDia=(double)suma/d;    //transforma la divisió a real --> en decimals
            IO.println( paginesPerDia>=300 ? "Estas flipant" : ( paginesPerDia >= 200 ? "Factible" : "Easy Peasy") );

            //Decrementem el número de casos
            numCasos--;
        }

    }

}

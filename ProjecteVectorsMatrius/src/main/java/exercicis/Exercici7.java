package exercicis;

import java.util.Random;

public class Exercici7 {

    static void main() {
        //Declaració de variables
        int[] dau;
        int numCares;
        int numTirades;
        Random r=new Random();

        //Demanem número de cares del dau
        do{
            numCares=Integer.parseInt(IO.readln("Quantes cares té el teu dau (mínim 2)?: "));
            if(numCares>=2) break;
            else IO.println("El mínim de cares és 2!!");
        }while(true);

        //Ara que ja sabem el número de cares, podem instanciar el vector
        dau=new int[numCares];

        //Demanem número de tirades
        do{
            numTirades=Integer.parseInt(IO.readln("Quantes tirades vols fer (mínim 1)?: "));
            if(numTirades>=1) break;
            else IO.println("El mínim de tirades és 1!!");
        }while(true);

        //Bucle que simula les tirades
        for (int i = 0; i < numTirades; i++) {
            //Simulem la tirada
            int tirada=r.nextInt(dau.length);       //Genera enter entre 0 i el número de cares - 1

            //Anotem que ha sortit una de les cares
            dau[tirada]++;
        }

        //Mostrem quantes vegades ha sortit cada casella
        for (int i = 0; i < dau.length; i++) {
            IO.println(
                    String.format("La cara %d ha sortit %d vegades.", i+1, dau[i])
            );
        }
    }
}

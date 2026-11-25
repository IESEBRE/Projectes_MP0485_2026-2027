package exercicis;

import java.util.Random;

public class Exercici1 {

    static void main() {
        int numLletres;

        do {
            numLletres = Integer.parseInt(IO.readln("Digues quants caràcters vols vore: "));
            if(numLletres<1) IO.println("Ha de ser major que 0!!");
            else break;
        }while(true);

        for (int i = 0; i < numLletres; i++) {
            IO.print(retornaCaracter());
        }

    }



    public static char retornaCaracter(){

        return (char)(new Random().nextInt('}'-' '+1)+' ');

    }

}

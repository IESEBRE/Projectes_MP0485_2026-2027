package exercicis;

import java.util.Random;

public class Exercici9 {

    static void main() {
        //Declaració de variables
        Random r=new Random();
        int[] aparicions=new int['Z'-'A'+1];        //generem un vector ple de 0s
        int numLletres;

        //Demanem número de lletres de la frase
        do{
            numLletres=Integer.parseInt(IO.readln("Quantes lletres vols generar (mínim 1)?: "));
            if(numLletres>=1) break;
            else IO.println("El mínim de lletres és 1!!");
        }while(true);

        //Generem les lletres aleatòries i apuntem les aparicions
        IO.println("Caràcters aleatoris:\n");
        for (int i = 0; i < numLletres; i++) {
            char lletra=(char)(  r.nextInt('Z'-'A'+1)+'A'      );

            //Mostrem el caràcter aparegut
            IO.print(lletra);

            //Incremento els comptadors de la lletra generada
            aparicions[lletra-'A']++;
        }
        IO.println();

        //Mostrem el resultat
        for (int i = 0; i < aparicions.length; i++) {
            //Mostrem només les lletres que han aparegut
            if(aparicions[i]!=0)
                IO.println(
                        String.format("El caràcter %c ha sortit %d vegades.", i+'A', aparicions[i] )
                );
        }

    }
}

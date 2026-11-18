package exercicis;

import java.util.Random;

public class Exercici9Bis {

    static void main() {
        //Declaració de variables
        Random r=new Random();
        int[] aparicions=new int['Z'-'A'+1];        //generem un vector ple de 0s
        int numLletres;
        String text="";

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

            //Mostrem el caràcter aparegut i el concatenem a un string
            IO.print(lletra);
            text+=lletra;

            //Incremento els comptadors de la lletra generada
            aparicions[lletra-'A']++;
        }
        IO.println();

        //Mostrem el resultat recorrent el text
        for (int i = 0; i < text.length(); i++) {
            //Mostrem només les lletres que han aparegut
            if(aparicions[text.charAt(i)-'A']>0) {
                IO.println(
                        String.format("El caràcter %c ha sortit %d vegades.", text.charAt(i), aparicions[text.charAt(i) - 'A'])
                );
                //Posem el comptador de la lletra actual a 0 per no tornar a repetir-la
                aparicions[text.charAt(i)-'A']=0;
            }
        }

    }
}

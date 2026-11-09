package exercicis;

import java.util.Scanner;

public class Exercici5 {

    static void main() {
        //Declaració de variables
        String frases="", frase;
        Scanner ent = new Scanner(System.in);
        int index, comptador=0;

        //Llegir un text multifrase acabat en punt
        System.out.println("Escriu una o més línies de text i el '.' per acabar: ");
        do{
            //A cada iteració llegim una sola línia
            String text= ent.nextLine().trim();
            if(frases.isEmpty())
                frases=text;
            else
                frases=frases+"\n"+text;                    //concatenem la nova frase (com sumar) posant un salt de línia pel mig
            //Si la frase no és buida i acaba en punt sortim del bucle
            if(!text.isEmpty() && text.charAt(text.length()-1)=='.') break;
        }while(true);

        //Llegir una frase acabada en intro
        do{
            System.out.println("Escriu una frase no buida i acabada en INTRO: ");
            frase= ent.nextLine().trim();
            if(frase.isBlank()) System.out.println("La frase no pot ser buida.");
            else break;
        }while(true);

        //Comptar i mostrar aparicions de la segona dins la primera
        index=0;        //inicialitzo a la posició de més a l'esquerra
        do {
            index=frases.indexOf(frase,index);
            if(index!=-1) comptador++;      //hem trobat el  caracter i incrementem comptador
            else break;
            //Passem al caracter següent del trobat per evitar el bucle infinit
            index++;
        }while(true);

        System.out.printf("El text:\"%s\"%nconté el text:%n\"%s\"%n%d vegades.%n", frases, frase, comptador);


    }
}

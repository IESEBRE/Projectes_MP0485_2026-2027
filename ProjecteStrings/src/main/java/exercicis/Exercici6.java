package exercicis;

import java.util.Scanner;

public class Exercici6 {

    static void main() {
        //Declaració de variables
        String frases="",
                separadors=" ',\n.;:-";             //cadena en tots los separadors possible
        Scanner ent = new Scanner(System.in);
        int comptador=0;                            //comptador de paraules

        //Llegir un text multifrase acabat en punt
        System.out.println("Escriu una o més línies de text i una que contingue el '.' per acabar: ");
        do{
            //A cada iteració llegim una sola línia
            String linia= ent.nextLine().trim();
            if(frases.isEmpty())
                frases=linia;
            else
                frases=frases+"\n"+linia;                    //concatenem la nova frase (com sumar) posant un salt de línia pel mig

            //Comptem les paraules de la línia actual
            boolean esParaula=false;                        //inicialment no estic dins d'una paraula
            for (int i = 0; i < linia.length(); i++) {
                char c=linia.charAt(i);
                //Miro si el caracter és de paraula o de separador
                if(separadors.indexOf(c)==-1){          //el caracter NO és un separador
                    //Farem tractament diferent segon si estem o no dins d'una paraula
                    if(!esParaula){
                        comptador++;                    //acabo d'entrar a una paraula i incremento el comptador
                        esParaula=true;                 //anoto que estic dins d'una paraula
                    }
                }else{                                  //el caracter ÉS un separador
                       esParaula=false;                 //anoto que NO estic dins d'una paraula
                }
            }


            //Si la frase conté el punt sortim del bucle
            if(linia.contains(".")) break;
        }while(true);


        //Mostrem el resultat
        System.out.printf("El text:\"%s\"%nconté %d paraules.%n", frases, comptador);
    }

}

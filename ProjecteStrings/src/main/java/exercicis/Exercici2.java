package exercicis;

import java.util.Scanner;

public class Exercici2 {

    static void main() {
        //Declaració de variables
        String frases="";                 //frases inicials introduïdes per l'usuari
        Scanner ent = new Scanner(System.in);
        char caracter;                //caracter a buscar dins la frase
        int comptador=0;              //guardem quantes vegades apareix el caracter a la frase
        int index;                    //rebrà les posicions on es troba el caracter dins de les frases

        //Lectura de les frases inicials
        System.out.println("Escriu una o més línies de text i el '.' per acabar: ");
        do{
            //A cada iteració llegim una sola línia
            String frase= ent.nextLine().trim();
            frases=frases+"\n"+frase;                    //concatenem la nova frase (com sumar) posant un salt de línia pel mig
            //Si la frase acaba en punt sortim del bucle
            if(frase.endsWith(".")) break;
        }while(true);

        System.out.println("El text és "+frases);


        //Lectura del caracter
        do{
            System.out.println("Escriu un caracter i acaba en INTRO: ");
            //No llegim el caracter aquí per què NO estem segurs que n'hi haurà mínim un
            String text= ent.nextLine();
            if(text.isEmpty()) System.out.println("Has d'escriure mínim un caracter.");
            else {
                //Llegim el caracter aquí per què estem segurs que n'hi haurà mínim un
                caracter=text.charAt(0);
                break;
            }
        }while(true);

        System.out.println("El caracter a buscar és el '"+caracter+"'.");

        //Comptem i mostrem la solució  --> usarem el mètode indexOf

        index=0;        //inicialitzo a la posició de més a l'esquerra
        do {
            index=frases.indexOf(caracter,index);
            if(index!=-1) comptador++;      //hem trobat el  caracter i incrementem comptador
            else break;
            //Passem al caracter següent del trobat per evitar el bucle infinit
            index++;
        }while(true);

        System.out.printf("El caràcter ‘%c’ apareix %d vegades dins el text.%n", caracter, comptador);

    }
}

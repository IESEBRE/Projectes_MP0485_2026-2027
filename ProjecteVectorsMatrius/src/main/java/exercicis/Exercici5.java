package exercicis;

public class Exercici5 {

    static void main() {
        //Declaració de constants
        final int QUANTITAT=0;

        //Mirem si la QUANTITAT és correcta i en cas contari finalitzem el programa
        if(QUANTITAT<=0){
            IO.println("QUANTITAT ha de ser major que 0. Sortim del programa!!");
            System.exit(1);                                                   //sortim del programa directament
        }

        //Declaració de variables
        int[] numeros=new int[QUANTITAT];
        int suma=0;
        double mitjana=0.0;

        //Demanem a l'usuari la introducció dels valors numèrics i els anem sumant
        IO.println("Introduix els "+QUANTITAT+" valors enters: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=Integer.parseInt(IO.readln(String.format("Número %d: ", i+1)));
            suma+=numeros[i];
        }

        //Calculem la mitjana dels numeros introduïts
        mitjana=(double)suma/QUANTITAT;

        //Mostrem el resultat
        IO.println(String.format("Els valors majors o iguals que la mitjana %g són: ",mitjana));
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] >= mitjana ) IO.println(numeros[i]);
        }


    }


}

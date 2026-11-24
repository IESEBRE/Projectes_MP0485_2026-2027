package exemples;

import java.util.Arrays;

public class MetodesIV {

    static void main() {
        //Declaració de variables
        int[] numero={0,0,0,0,0};

        //Java usa pas de paràmetres per VALOR
        modifica(numero, false);       //numero és el paràmetre real/actual
        IO.println(String.format("El vector val %s.", Arrays.toString(numero)));
    }

    //El paràmetre formal és un objecte --> rebrà una còpia de l'adreça de memòria del paràmetre real que li passem
    public static void modifica(int[] numero, boolean perValor){          //numero és el paràmetre formal
        //Primer que res copiem l'array rebut a un altre obejcte array
        int[] copia=new int[numero.length];
        if(perValor) {
            for (int i = 0; i < copia.length; i++) {
                copia[i] = numero[i];
            }

            //Això fa que numero formal dixe d'apuntar a l'objecte del paràmetre real. Ara apuntarà a la seua còpia
            numero = copia;
        }
        //Modifiquem la còpia i dixem el paràmetre real intacte
        for (int i = 0; i < numero.length; i++) {
            numero[i]=numero[i]+1;
        }
        IO.println(String.format("El vector val %s.", Arrays.toString(numero)));
    }






}

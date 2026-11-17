package exemples;

import java.util.Random;

public class VectorsIVAleatorietat {

    static void main() {

        //Classe que permet generar números aleatoris
        Random r=new Random();

        /*IO.println(r.nextInt());
        IO.println(r.nextInt());
        IO.println(r.nextInt());
        IO.println(r.nextInt());
        IO.println(r.nextInt());
        for (int i = 0; i < 10; i++) {
            IO.print(r.nextInt(10));      //generarà alaeatoris entre 0 i 9
            IO.print(" ");
            IO.println(r.nextInt(10)+1);      //generarà alaeatoris entre 1 i 10
        }*/

        /*
        int[] vector={ 12, 4, -5, 67, 5, 92, -45};

        for (int i = 0; i < 10; i++) {
            IO.println(
                    vector[r.nextInt(vector.length)]        //el random me generarà enters entre 0 i length-1
            );
        }

        //Generar valors dins d'un interval específic --> del 234 al 562
        for (int i = 0; i < 10; i++) {
            IO.println(r.nextInt(562-234+1)+234);
        }
        IO.println();
        //Generar valors dins d'un interval específic --> del -234 al 562
        for (int i = 0; i < 10; i++)
        {
            IO.println(r.nextInt(562 + 234 + 1) - 234);
        }*/

        //Anem a generar lletres dins d'un interval  --> de la A a la Z
        for (int i = 0; i < 25; i++)
        {
            IO.print((char)(r.nextInt('z' - '!' + 1) + '!'));
            IO.print(
                    String.format("%c", r.nextInt('z' - '!' + 1) + '!')
            );
            IO.print(
                    String.format("%d", r.nextInt('z' - '!' + 1) + '!')
            );
        }

    }

}

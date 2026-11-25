package exercicis;

import java.util.Scanner;

public class Exercici6 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Introduix un enter (-1 per acabar):");
            numero = sc.nextInt();
            if (numero != -1) {

                if (primer(numero)) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }

        } while (numero != -1);
        sc.close();
    }


    public static boolean primer(int numero) {
        //Tractament del cas simple
        if (numero <= 1) return false;

        boolean primer = true;
        int divisor = 2;

        //Mirem possibles divisors entre l'arrel quadrada del número i el 2 --> eficient
        while (divisor * divisor <= numero && primer) {
            if (numero % divisor == 0) {
                primer = false;
            }
            divisor++;
        }
        return primer;

    }


}

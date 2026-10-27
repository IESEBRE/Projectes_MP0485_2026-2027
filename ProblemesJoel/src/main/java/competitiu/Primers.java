package competitiu;

import java.util.Scanner;

public class Primers {

    void main() {
        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            numero = sc.nextInt();
            if (numero != -1) {
                boolean primer = true;
                int divisor = 2;

                //Mirem possibles divisors entre l'arrel quadrada del número i el 2 --> eficient
                while (divisor * divisor <= numero && primer) {
                    if (numero % divisor == 0) {
                        primer = false;
                    }
                    divisor++;
                }

                if (primer) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }

        } while (numero != -1);
        sc.close();
    }

}




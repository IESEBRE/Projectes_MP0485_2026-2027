package extern;

import java.util.Scanner;

public class CompresionRLE {

    static void main() {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.skip("[\r\n]*").nextInt();

        //Bucle per tractar cada cas
        while (numCasos > 0) {
            //Tractar cas actual
            String text=ent.skip("[\r\n]*").nextLine();
            int compt=0;
            char carActual=' ';

            //Recorrer el text buscant repeticions
            for (int i = 0; i < text.length(); i++) {
                //Mirant si el comptador val 0 sé si començo un nou caracter
                if(compt==0){
                    carActual=text.charAt(i);
                    compt=1;
                }else{
                    //Continuem en el mateix caracter o no
                    if(carActual==text.charAt(i)) compt++;
                    else{
                        System.out.printf("%d %c ", compt, carActual);
                        carActual=text.charAt(i);
                        compt=1;
                    }
                }
            }
            System.out.printf("%d %c%n", compt, carActual);

            //Decrementem el número de casos
            numCasos--;
        }

    }


}

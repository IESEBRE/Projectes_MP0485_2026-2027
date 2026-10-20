package extern;

import java.util.Scanner;

public class HoraDescomprimir {

    void main() {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        //Bucle per tractar cada cas
        while (numCasos > 0) {
            //Tractar cas actual
            //int repeticions=ent.nextInt();
            //String caracter=ent.nextLine().trim();

            int repeticions=Integer.parseInt(ent.skip("[\r\n]*").next());
            String caracter=ent.skip("[\r\n]*").next();

            while(repeticions>0){
                IO.print(caracter);
                repeticions--;
            }

            IO.println();

            //Decrementem el número de casos
            numCasos--;
        }

    }

}

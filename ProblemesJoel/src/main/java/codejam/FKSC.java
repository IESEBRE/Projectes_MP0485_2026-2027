package codejam;

import java.util.Scanner;

public class FKSC {

    static void main() {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.skip("[\r\n]*").nextInt();

        //Bucle per tractar cada cas
        while (numCasos > 0) {
            //Tractar cas actual
            char tipo=ent.skip("[\r\n]*").nextLine().charAt(0);
            String linia=ent.nextLine();

            int ini=0, fi;

            do{
                fi=linia.indexOf(' ', ini);
                if(fi!=-1){
                    IO.print(tipo=='P' || (tipo=='C' && ini!=0) ? linia.toUpperCase().charAt(ini) : linia.toLowerCase().charAt(ini));
                    IO.print(linia.toLowerCase().substring(ini+1, fi));
                    IO.print(tipo=='K' ? '-' : ( tipo=='S'? '_': ""));
                    ini=fi+1;
                }else{
                    IO.print(tipo=='P' || (tipo=='C' && ini!=0) ? linia.toUpperCase().charAt(ini) : linia.toLowerCase().charAt(ini));
                    IO.println(linia.toLowerCase().substring(ini+1));
                    break;
                }
            }while(true);

            //Decrementem el número de casos
            numCasos--;
        }
    }
}

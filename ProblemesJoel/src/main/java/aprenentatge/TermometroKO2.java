package aprenentatge;

public class TermometroKO2 {

    static void main() {
        //Declaració de variables
        int numCasos = Integer.parseInt(IO.readln());

        //Bucle per tractar cada cas
        while (numCasos > 0) {
            //Tractar cas actual
            int numCaselles = Integer.parseInt(IO.readln());

            //Separem els números de la segona línia del cas en una sol mètode String.split(....)
            String[] temperatures=new String[numCaselles];
            temperatures=IO.readln().split(" ");

            //Ho lligo com a String ja que les temperatures les tinc en format String
            String valorKO = IO.readln().trim();

            //Comparem els valors del vector i mostrem el resultat
            for (int i = 0; i < temperatures.length; i++) {
                if(temperatures[i].equals(valorKO)) IO.print("-1 ");
                else  IO.print(temperatures[i]+ " ");
            }

            //Posem el salt de línia final
            IO.println();

            //Decrementem el número de casos
            numCasos--;
        }

    }

}

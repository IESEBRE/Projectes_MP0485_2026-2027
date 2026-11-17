package introduccio;

public class DonutsSospitosos {

    static void main() {

        //Declaració de variables
        int numCasos = Integer.parseInt(IO.readln());

        //Bucle per tractar cada cas
        while (numCasos > 0) {
            //Tractar cas actual
            //Llegim número de donuts
            int numDonuts = Integer.parseInt(IO.readln());
            //Llegim els donuts i els guardem a un vector
            String[] tipos=IO.readln().trim().split(" ");

            boolean perill=false;
            //Busquem si hi ha o no 3 repetits
            /*for (int i = 0; i < tipos.length-2 && !perill; i++) {
                perill=tipos[i].equals(tipos[i+1]) && tipos[i+1].equals(tipos[i+2]);
            }*/

            //Busquem repetits de 2 en 2
            int cont=0;                 //número de parelles consecutives i iguals hem trobat
            for (int i = 0; i < tipos.length-1 && !perill; i++) {
                if(tipos[i].equals(tipos[i+1])) cont++;
                else cont=0;
                perill=(cont==2);
            }

            //Mostrem el resultat segons si hi havia o no 3 repetits
            IO.println(perill ? "PERILL" : "SEGUR");

            //Decrementem el número de casos
            numCasos--;
        }

    }

}

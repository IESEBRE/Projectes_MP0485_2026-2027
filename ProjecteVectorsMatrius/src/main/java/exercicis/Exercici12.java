package exercicis;

public class Exercici12 {

    static void main() {
        //Declaració de variables
        int n;
        int[][] matriu;

        //Forcem a l'usuari a intriduir un valor positiu
        do{
            n=Integer.parseInt(IO.readln("Introduix un valor enter positiu: "));
            if(n>0) break;
            else IO.println("Ha de ser positiu!!");
        }while(true);

        //Ara que tenim la n, instanciem la matriu
        matriu=new int[n][n];

        //Anem recorrent, omplint i mostrant les caselles de la matriu
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j]=      i==j || i+j==matriu.length-1  ? 1 :    0       ;
                IO.print(String.format(matriu.length<32?"%4d":"%5d", matriu[i][j]));
            }
            IO.println();
        }



    }
}

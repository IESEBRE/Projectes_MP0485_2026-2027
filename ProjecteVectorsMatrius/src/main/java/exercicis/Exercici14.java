package exercicis;

public class Exercici14 {

    static void main() {
        //Declaració de variables
        int n;
        char[][] matriu;
        char c='A';

        //Forcem a l'usuari a intriduir un valor positiu
        do{
            n=Integer.parseInt(IO.readln("Introduix un valor enter positiu: "));
            if(n>0) break;
            else IO.println("Ha de ser positiu!!");
        }while(true);

        //Ara que tenim la n, instanciem la matriu
        matriu=new char[n][n];
        n=0;

        //Anem recorrent, omplint i mostrant les caselles de la matriu
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j]=c++;
                if(c=='Z'+1) c='A';
                IO.print(String.format("%2C", matriu[i][j]));
            }
            IO.println();
        }
    }
}

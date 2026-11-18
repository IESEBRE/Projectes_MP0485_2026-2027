package exemples;

import java.util.Random;

public class VectorsV {

    static void main() {
        //Vectors multidimensionals
        /*int[][] matriu=new int[2][3];       //2 files x 3 columnes
        Random r=new Random();

        //Recorregut d'vector multidimensional --> necessitem tants for com dimensions té la matriu
        for (int i = 0; i < matriu.length; i++) {   //recorrem les files
            for (int j = 0; j < matriu[i].length; j++) {    //recorrem les columnes d'una fila
                matriu[i][j]=r.nextInt(100);
                IO.print(String.format("%3d",matriu[i][j]));                   //accedim a una casella
            }
            IO.println();
        }

        int[][] matriu2=new int[3][];      //quan instanciem només hem de dir la primera dimensió
        matriu2[0]=new int[5];              //la primera fila té 5 columnes
        matriu2[1]=new int[]{1,2,3};        //la segona té 3 columnes que contenen 1, 2 i 3 respectivament
        matriu2[2]=new int[4];              //la tercera fila te 4 columnes

        for (int i = 0; i < matriu2.length; i++) {   //recorrem les files
            for (int j = 0; j < matriu2[i].length; j++) {    //recorrem les columnes d'una fila
                IO.print(String.format("%3d",matriu2[i][j]));                   //accedim a una casella
            }
            IO.println();
        }*/

        //Vector de 3 dimensions
        int[][][] cub=new int[2][3][4];

        for (int i = 0; i < cub.length; i++) {
            for (int j = 0; j < cub[i].length; j++) {
                for (int k = 0; k < cub[i][j].length; k++) {
                    cub[i][j][k]=3;
                }
            }
        }

    }


}

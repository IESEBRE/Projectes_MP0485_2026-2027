package exemples;

import java.util.Scanner;

public class VectorsI {

    static void main() {
        //Declaració d'un vector
        //tipo[] nomVector;
        String[] vectorCadenes, vectorCadenesCopia;
        int[] vectorEnters;
        Scanner[] vectorEscaners;

        //Instanciació d'un vector
        vectorCadenes=new String[5];    //Hem creat un objecte vector de 5 caselles
                                        //La dimensió d'un vector en Java és immutable
        vectorCadenesCopia=vectorCadenes;

        vectorEnters=new int[3];
        vectorEnters=new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31 , 30, 31};    //12 caselles
        vectorEscaners=new Scanner[0];  //Vector de 0 caselles --> se pot fer....
        //vectorEscaners=new Scanner[-10];  //Vector de -10 caselles --> peta

        //Declarem la dimensió utilitzant una variable entera
        int dimensio=10;
        vectorCadenes=new String[dimensio];     //vector de 10 caselles
        dimensio=25;
                                                //vector continua tenint 10 caselles

        //Podem declarar i instanciar un vector a la vegada en una sola instrucció
        int[] notes={0,1,2,3,4,5,6,7,8,9,10};   //únic cas en que no cal usar new
        int[] notes2=new int[]{0,1,2,3,4,5,6,7,8,9,10}; //evidenment se pot usar

    }


}

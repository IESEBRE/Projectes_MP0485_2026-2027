package exercicis;

import java.util.Random;

public class Exercici1Bis {

    static void main() {
        int numLletres;

        do {
            numLletres = Integer.parseInt(IO.readln("Digues quants caràcters vols vore: "));
            if(numLletres<1) IO.println("Ha de ser major que 0!!");
            else break;
        }while(true);

        for (int i = 0; i < numLletres; i++) {
            IO.print(retornaCaracter('A','A'));
        }

    }



    public static char retornaCaracter(){
        return (char)(new Random().nextInt('}'-' '+1)+' ');
    }


    public static char retornaCaracter(char ini, char fi){
        //Mirem si ini<fi i sinó els intercanviem
        if(ini>fi){
            char temp=ini;
            ini=fi;
            fi=temp;
        }

        //Segur que ini<=fi
        return (char)(new Random().nextInt(fi-ini+1)+ini);
    }



}

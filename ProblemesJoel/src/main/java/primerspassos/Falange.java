package primerspassos;

import java.util.Scanner;

public class Falange {

    void main(){
        //Declaració de variables i aprofito per llegir els valors
        Scanner ent=new Scanner(System.in);     //Uso Scanner ja que es reben totes les dades en una línia

        int a1=ent.nextInt(),
                b1=ent.nextInt(),
                c1=ent.nextInt(),
                a2=ent.nextInt(),
                b2=ent.nextInt(),
                c2=ent.nextInt();

        //Mirem els possibles casos
        if(a1+1==a2 && b1==b2 && c1==c2) IO.println("A");
        else if(a1==a2 && b1+1==b2 && c1==c2) IO.println("B");
        else if(a1==a2 && b1==b2 && c1+1==c2) IO.println("C");
        else if(a1==a2 && b1==b2 && c1==c2) IO.println("BLANC");
        else IO.println("NUL");


    }


}

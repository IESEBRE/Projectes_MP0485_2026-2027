package org.example.exercicis;

public class Exercici2 {

    void main(){
        //Declaració de variables
        int ini, fin, opcio;

        //Demanem a l'usuari la introducció dels 2 números
        ini=Integer.parseInt(IO.readln("Introduix un número enter: "));
        fin=Integer.parseInt(IO.readln("Introduix un altre número enter: "));

        //Comprovem si els números s'han introduït en ordre ascendent i sinó el intercanviem
        if(ini>fin){
            int temp=ini;   //guardo un dels 2 valors a una variable temporal
            ini=fin;        //actualitzo la variable anterior en el valor de la que no tinc guardada
            fin=temp;       //actualitzo la variable que no tinc guardada en el valor de la temporal
        }
        //Sé segur que ini<=fin

        //Anem a posar el menú de l'ampliació   --> uso un do_while per què he d'entrar mínim una vegada
        do{
            //Mostrem les opcions del menú
            IO.println("0. Sortir");
            IO.println("1. Solució en for");
            IO.println("2. Solució en while");
            IO.println("3. Solució en do_while");
            opcio=Integer.parseInt(IO.readln("Tria una opció: "));

            switch(opcio){
                case 0:
                    break;
                case 1:
                    for(int i=ini; i<=fin; i++)
                        if(i%2==0) IO.println(i+" és parell.");
                        else  IO.println(i+" és imparell.");

                    break;
                case 2:
                    int i=ini;
                    while(i<=fin){
                        if(i%2==0) IO.println(i+" és parell.");
                        else  IO.println(i+" és imparell.");

                        i++;
                    }
                    break;
                case 3:
                    i=ini;
                    do{
                        if(i%2==0) IO.println(i+" és parell.");
                        else  IO.println(i+" és imparell.");

                        i++;
                    }while(i<=fin);

                    break;
                default:
                    IO.println("Opció de menú incorrecta!!");
            }
        }while(opcio!=0);
    }

}

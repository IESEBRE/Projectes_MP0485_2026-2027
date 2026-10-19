package org.example.repetitives;

public class EstructuresRepetitivesIII {

    void main(){
        //2ª estructura repetitiva do while
        /*
        do{
            //cos del bucle
        }while(condició);
        */

        /*
        //declaració de variables
        int numParell=1;            //inicialitzem la variable per poder entrar al while

        //Exemple de while ---> demanem a l'usuari dins del bucle l'introducció d'un número
        // enter parell i no parem fins aconseguir-ho
        while(numParell % 2 == 1){
            numParell=Integer.parseInt(IO.readln("Escriu un enter parell: "));
            if(numParell%2==1) IO.println("És imparell. Try again!!");
        }
        */

        //declaració de variables
        int numParell;              //no cal inicialitzar la variable

        //Bucle millor que el while si el cos l'hem d'executar SEMPRE com a mínim una vegada
        do{
            numParell=Integer.parseInt(IO.readln("Escriu un enter parell: "));
            if(numParell%2==1) IO.println("És imparell. Try again!!");
        }while(numParell%2==1);

        //Versió millorada per què la condició apareix una sola vegada
        do{
            numParell=Integer.parseInt(IO.readln("Escriu un enter parell: "));
            if(numParell%2==1) IO.println("És imparell. Try again!!");
            else break;
        }while(true);

        do
            numParell=Integer.parseInt(IO.readln("Escriu un enter parell: "));
        while(numParell%2==1);

    }
}

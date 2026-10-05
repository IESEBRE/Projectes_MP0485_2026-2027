package org.example;

public class EstructuresCondicionalsIII {

    void main(){
        //Declaració de variables
        int numero;

        numero=Integer.parseInt(IO.readln("Introduix un número enter:"));

        //Depenent del valor del numero farem coses diferents...
        if(numero==0) System.out.println("has introduit un zero");
        else if (numero==1) {
            System.out.println("Has introduit un ú");
        } else if (numero == 2) {
            System.out.println("Has introduit un dos");
        } else System.out.println("Has introduit un mumero menor que zero o major que 2");

        //Fem el mateix usnt un SWITCH
        switch(numero){
            case 0:
                System.out.println("has introduit un zero");
                break;                                          //fa que sortim del switch si entrem en un case
            case 1:
                System.out.println("Has introduit un ú");
                break;
            case 2:
                System.out.println("Has introduit un dos");
                break;
            default:
                System.out.println("Has introduit un mumero menor que zero o major que 2");
                break;
        }

    }
}

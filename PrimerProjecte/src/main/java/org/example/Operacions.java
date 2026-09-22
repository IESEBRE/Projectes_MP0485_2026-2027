package org.example;

public class Operacions {

    public static void main(String[] args) {
        //Operacions

        //Suma --> tant d'enters com de reals
        int numero=3+56;
        int altreNumero=numero+numero;

        double sumaReal=numero + 5.0;   //si algun terme és real la suma és real

        int sumat=numero++;     //equivalent a sumat=numero+1;
        sumat=++numero;

        //Prova de ++
        int valor=0;
        IO.println(valor);
        IO.println(valor++);    //1r mostrem, 2n valor=valor+1 --> ++ postfixa
        IO.println(valor);
        IO.println(++valor);    //1r valor=valor+1, 2n mostrem --> ++ prefixa
        IO.println(valor);

        //Multiplicació
        valor=3*5;


        //Limitacions dels números --> NO INFINITS
        valor=Integer.MAX_VALUE+1;
        IO.println(valor);
        IO.println(Integer.MIN_VALUE);

        //Divisió
        valor=10/5; //divisió entera
        double divisioReal=10.0/5; //divisió real
        divisioReal=10/5;

        IO.println(10/3);
        IO.println(10%3);

        IO.println(10.0/3);



    }

}

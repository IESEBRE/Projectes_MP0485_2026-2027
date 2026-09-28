package org.example;

public class OperacionsLogiques {

    void main(){
        //Declaració de variables
        boolean esDilluns=true, esFinde=false;

        //I lògica --> &&
        IO.println(  esDilluns && esFinde   );      //false
        IO.println(  esFinde && esDilluns   );      //false
        IO.println(  esDilluns && esDilluns   );    //true
        IO.println(  esFinde && esFinde   );        //false

        //O lògica --> ||
        IO.println(  esDilluns || esFinde   );      //true
        IO.println(  esFinde || esDilluns   );      //true
        IO.println(  esDilluns || esDilluns   );    //true
        IO.println(  esFinde || esFinde   );        //false

        //Negació --> !
        IO.println( !esDilluns );
        IO.println( !esFinde );

        //Expressió lògica més complexa
        IO.println(  esDilluns && !esFinde ||  esFinde || esDilluns  && esFinde   );
        IO.println(  esDilluns && true ||  esFinde || esDilluns  && esFinde   );
        IO.println(  esDilluns && true ||  esFinde || esDilluns  && esFinde   );
        IO.println(      true          ||  esFinde || esDilluns  && esFinde   );
        IO.println(      true          ||  esFinde ||       false   );
        IO.println(                   true         ||       false   );
        IO.println(                               true              );

        //Operadors relacionals
        // == --> igualtat
        // != --> desigualtat
        // > --> major que
        // < --> menor que
        // >= --> major o igual que
        // <= --> menor o igual que
        int numero=10;
        IO.println( numero == 10 );
        IO.println( numero != 10 );
        IO.println( numero > 10 );
        IO.println( numero < 10 );
        IO.println( numero >= 10 );
        IO.println( numero <= 10 );


        IO.println(  numero == 10 && !esFinde ||  !(numero >= 10) || esDilluns  && esFinde   );

    }






}

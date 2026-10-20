package primerspassos;

public class JugadorsAmbSortV2 {

    void main(){
        //Declaració de variables
        int valor,
                maxim=0;    //guardem el valor màxim introduit de moment --> li assignarem inicialment el primer valor
                            // introduit
        boolean primer=true;//me diu quan m'estan introduint el primer dels valors

        //Utilitzo un do while ja que hem de llegir com a mínim un valor
        do{
            valor=Integer.parseInt(IO.readln());
            if(valor==0) break;
            if(primer) maxim=valor;             //el primer valor serà automàticament el màxim
            else if(valor>maxim) maxim=valor;   //a partir del 2n valor mirem si és un nou màxim o no
            primer=false;                       //Una vegada hem llegit el primer valor posem el booleà a false
        }while(true);

        IO.println(maxim);


    }
}

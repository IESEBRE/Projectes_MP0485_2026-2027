package primerspassos;

public class JugadorsAmbSort {

    void main(){
        //Declaració de variables
        int valor,
                maxim=Integer.MIN_VALUE;      //guardem el valor màxim introduit de moment --> important, l'enter més
                                              // menut possible

        //Utilitzo un do while ja que hem de llegir com a mínim un valor
        do{
            valor=Integer.parseInt(IO.readln());
            if(valor==0) break;
            if(valor>maxim) maxim=valor;
        }while(true);

        IO.println(maxim);


    }
}

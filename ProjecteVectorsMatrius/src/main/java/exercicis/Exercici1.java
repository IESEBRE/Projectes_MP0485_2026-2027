package exercicis;

public class Exercici1 {


    static void main() {
        //Declaració de variables
        int numero, divisor=2;
        int[] factors;              //guardem los factors primers

        //Demanem el número enter positiu a l'usuari, forçant-ho
        do {
            numero = Integer.parseInt(IO.readln("Introduix un enter positiu: "));
            if (numero < 1) IO.println("Ha de ser positiu (>0)");
            else break;
        }while(true);



        //Declaro la dimensió del vector de factors una vegada sé el valor del número
        int grandaria=Math.round((float)(Math.log(numero) / Math.log(2)));
        factors=new int[grandaria];
        int index=0;                            //index que utilitzarem per anar omplint el vector de factors

        //Començo a escriure la solució
        IO.println(String.format("Descomposició factorial de %d: ", numero));

        //Bucle que troba els factors primers
        do{
            if(numero % divisor==0){
                factors[index++]=divisor;   //guardo el factor a la casella corresponent
                numero/=divisor;
            }else divisor++;
        }while(numero!=1);

        if(numero!=1)           //Si el número és 1 no cal recorrer el vector
            //Mostro la solució recorrent el vector de factors a la inversa
            do{
                IO.print(String.format("%d * ", factors[--index]));
            }while(index>0);

        //Finalment mostrem l'1 ja que pretany a totes les descomposicions factorials
        IO.println("1");
    }
}

package aprenentatge;

public class SerpienteMatematica {

    void main(){
        int n=Integer.parseInt(IO.readln());
        int actual=1;                           //variable que controlarà el bucle ppal
        int mostrar=2;                          //valor inicial a mostrar

        while(actual<=n){
            //Mostrar cada fila
            int nCol=1;

            while(nCol<=n){
                //Escriure el valor per pantalla
                //IO.print(mostrar+" ");
                System.out.format("%d ", mostrar);
                nCol++;
                //Modifiquem el valor a mostrar
                if(actual%2==1) mostrar+=2;
                else mostrar-=2;
            }
            //Preparem el número a mostrar per la següent línia
            if(actual%2==1) mostrar+=2*n-2;
            else mostrar+=2*n+2;

            IO.println();
            actual++;
        }
    }
}

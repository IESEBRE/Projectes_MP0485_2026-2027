package primerspassos;

public class CrideuAmbulancia {

    void main(){
        //Declaració de variables
        int distanciaProfessor=Integer.parseInt(IO.readln());
        int sirena=Integer.parseInt(IO.readln());
        int minut=1;
        int distanciaRecorreguda=0;     //com anirem sumant inicialitzem a 0

        //Necessitem un bucle per anar sumant la distancia recorreguda
        while(distanciaRecorreguda<distanciaProfessor){
            //Hem de mirar si és un minut que toca la sirena o no
            if(minut%sirena != 0) distanciaRecorreguda+=minut;
            else distanciaRecorreguda+=minut*2;
            //Incrementem el comptador de minuts
            minut++;
        }

        //Mostrar els minuts transcorreguts (resto un que he de sumat de més anteriorment)
        IO.println(--minut);
    }

}

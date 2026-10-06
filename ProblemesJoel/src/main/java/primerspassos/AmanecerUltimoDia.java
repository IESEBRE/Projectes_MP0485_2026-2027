package primerspassos;

public class AmanecerUltimoDia {

    void main(){

        //Declaració de variables
        int dia=Integer.parseInt(IO.readln());

        //Miro si els segons que resten descomptant dies sencers pertanyen a la primera o segona meitat del dia
        IO.print( dia % (60*60*24) < 60*60*12 ? "mati" : "nit" );
        IO.print(" del dia ");
        //Miro quants dies sencers conté el número de segons rebut, i li sumo 1
        IO.println(dia/(60*60*24)+1);
    }
}

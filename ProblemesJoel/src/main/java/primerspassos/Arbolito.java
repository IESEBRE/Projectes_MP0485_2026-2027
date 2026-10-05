package primerspassos;

public class Arbolito {

    void main(){
        //Declaració de variables
        double minim , maxim, planta;
        int comptador=0;

        //Llegim minim i màxim
        minim=Double.parseDouble(IO.readln());
        maxim=Double.parseDouble(IO.readln());

        //Llegim 1a planta
        planta=Double.parseDouble(IO.readln());
        if(minim<planta && planta<maxim) comptador++;

        //Llegim 2a planta
        planta=Double.parseDouble(IO.readln());
        if(minim<planta && planta<maxim) comptador++;

        //Llegim 3a planta
        planta=Double.parseDouble(IO.readln());
        if(minim<planta && planta<maxim) comptador++;

        //Mostrem el comptador com a resultat
        IO.println(comptador);

    }
}

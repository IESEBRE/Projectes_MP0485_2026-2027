package primerspassos;

public class CaramelsSobrants {

    void main(){
        //Declaració de variables
        int nebots, caramels;

        //Llegim les dades sense println previ ja que és per al JOEL
        caramels=Integer.parseInt(IO.readln());
        nebots=Integer.parseInt(IO.readln());

        //Mostro el resultat
        IO.println(caramels%nebots);

    }

}

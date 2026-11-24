package exemples;

public class MetodesIII {

    static void main() {
        //Declaració de variables
        int numero=0;

        //Java usa pas de paràmetres per VALOR
        modifica(numero);
        IO.println(String.format("El numero val %d.", numero));

        modifica(10);
    }

    public static void modifica(int numero){
        numero=numero+1;
        IO.println(String.format("El numero val %d.", numero));
    }


}

package exercicis;

public class Exercici4 {

    public static String insertaCadena(String primer, String segon, int numero){
        //Tractament dels casos especials
        if(primer==null && segon==null) return null;
        if(primer==null) return segon;
        if(segon==null) return primer;
        if(numero<0) numero=0;
        if(numero>primer.length()) numero=primer.length();

        //Si arribem aquí hem d'insertar el segon dins el primer a la posicio indicada pel número
        return "";
    }
}

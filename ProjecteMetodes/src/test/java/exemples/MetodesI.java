package exemples;

import java.util.Random;

public class MetodesI {

    //Mètode main --> estructura definida pel propi llenguatge i versió del JDK
    public static void main(String[] args){
        //Declaració de variables
        int valorAleatori=retornaEnter();
        int suma=retornaEnter()+retornaEnter();

        for (int i = 0; i < retornaEnter() && retornaBoolea(); i++) {
            IO.println(String.format("El %dº valor aleatori val %d.", i+1, retornaEnter()));
        }

        //Cridem al mètode
        MetodesI.nomMetode();
    }


    //Un mètode fet per mi que no retorna
    public static void nomMetode(){
        //Cos del mètode --> declaracions de variables, instruccions, ...
        IO.println("Sóc un mètode que no retorna");
    }

    //Un mètode fet per mi que retorna un enter aleatori entre 0 i 99
    public static int retornaEnter(){
        //Cos del mètode --> declaracions de variables, instruccions, ...
        return new Random().nextInt(100);
    }

    //Un mètode fet per mi que retorna false o true aleatòriament
    public static boolean retornaBoolea(){
        //Tot camí del mètode ha d'arribar a un return, sinó el codi no compila
        if(new Random().nextInt()%2==0 ) return true;
        else return false;
    }

}

package exemples;

import java.util.Scanner;

public class CadenesII {

    void main(){

        //Com llegim un sol caracter??
        Scanner ent=new Scanner(System.in);
        System.out.println("Escriu S per continuar: ");
        char c=ent.nextLine().charAt(0);                  //Excepció si rebem la cadena buida
        if(c=='S') IO.println("Continuem...");            //Comparem si el caracter introduït és la S

        //Com llegim un sol caracter evitant la possible excepció??
        ent=new Scanner(System.in);
        System.out.println("Escriu S per continuar: ");
        String cadena=ent.nextLine();
        if(cadena.length()!=0)             //Serà true si no han escrit la cadena buida
            if(cadena.charAt(0)=='S') IO.println("Continuem...");            //Comparem si el caracter introduït és la S
        if(!cadena.isEmpty())             //Serà true si no han escrit la adena buida
            if(cadena.charAt(0)=='S') IO.println("Continuem...");            //Comparem si el caracter introduït és la S
        if(!cadena.isBlank())             //Serà true si no han escrit la cadena buida o només espais en blanc
            if(cadena.charAt(0)=='S') IO.println("Continuem...");            //Comparem si el caracter introduït és la S



    }

}

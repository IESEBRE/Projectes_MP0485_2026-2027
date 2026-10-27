package exemples;

public class Cadenes {

    void main(){
        int i=0;
        String cadena="Sóc una cadena.";                                //cadena és un objecte
        String cadena2=new String("Sóc una altra cadena");      //cadena2 és un objecte

        //Mètodes de les cadenes que usarem
        IO.println(String.format("La cadena %s té %d caracters.", cadena,cadena.length()));

        i=0;
        IO.println(String.format("El caràcter situat a la posició %d és el %c", i, cadena.charAt(i)));
        i=cadena.length()-1;
        IO.println(String.format("El caràcter situat a la posició %d és el %c", i, cadena.charAt(i)));
        //i=cadena.length();  --> provoca StringIndexOutOfBounds exception
        //IO.println(String.format("El caràcter situat a la posició %d és el %c", i, cadena.charAt(i)));

        //Recorrer els caracters d'una cadena
        int compAs=0;
        for (int j = 0; j < cadena.length(); j++) {
            IO.println(String.format("El caràcter situat a la posició %d és el %c", j, cadena.charAt(j)));
            if(cadena.charAt(j)=='a') compAs++;
        }

        //Com comparem el contingut d'una cadena??
        cadena=IO.readln("Escriu SI per continuar: ");
        if(cadena=="SI") IO.println("Continuem...");            //Comparem si el text introduït és el mateix objecte que la cadena "SI"
        if(cadena.equals("SI")) IO.println("Continuem...");     //Si funciona ja que mirem el contingut de la acdena, no si és o no el mateix objecte

        //Una altra comparació
        cadena=new String("Hola");
        cadena2=new String("Hola");
        if(cadena == cadena2) IO.println("Són el mateix objecte");            //Comparem si el text introduït és el mateix objecte que la cadena "SI"
        if(cadena.equals(cadena2)) IO.println("Tenen el mateix contingut, encara que són objectes diferents");
    }

}

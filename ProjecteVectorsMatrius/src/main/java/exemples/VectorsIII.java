package exemples;

public class VectorsIII {

    static void main() {
        //Declaració de variables
        /*String[] cadenes=null;

        //Intento recorrer el vector
        for (int i = 0; i < cadenes.length; i++) {      //NullPointerException cadenes.length
            IO.println(cadenes[i]);
        }

         */

        String[] cadenes=new String[10];
        //Intento recorrer el vector
        for (int i = 0; i < cadenes.length; i++) {
            IO.println(cadenes[i]);
            IO.println(cadenes[i].length());         //NullPointerException cadenes[i].length()
        }

    }
}

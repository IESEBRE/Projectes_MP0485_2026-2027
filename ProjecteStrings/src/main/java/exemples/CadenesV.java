package exemples;

public class CadenesV {

    static void main() {

        //Busquem un caracter dins d'un text començant per la dreta
        IO.println(  "ABCDEC".lastIndexOf('C')   );
        IO.println(  "ABCDEC".lastIndexOf('c')   );

        //Busquem un caracter dins d'un text començant per l'esquerra però a aprtir d'una posició especificada
        IO.println(  "ABCDEC".lastIndexOf('C', 0)   );
        IO.println(  "ABCDEC".lastIndexOf('C', 1)   );
        IO.println(  "ABCDEC".lastIndexOf('C', 2)   );
        IO.println(  "ABCDEC".lastIndexOf('C', 3)   );
        IO.println(  "ABCDEC".lastIndexOf('C', 4)   );
        IO.println(  "ABCDEC".lastIndexOf('C', 5)   );
        IO.println(  "ABCDEC".lastIndexOf('C', 6)   );
        IO.println(  "ABCDEC".lastIndexOf('C', -1)   );

        //També es pot buscar un text dins d'un altre
        IO.println(  "ABCDEC".lastIndexOf("CD")   );
        IO.println(  "ABCDEC".lastIndexOf("DC")   );
    }


}

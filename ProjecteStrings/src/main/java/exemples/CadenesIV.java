package exemples;

public class CadenesIV {

    static void main() {

        //Busquem un caracter dins d'un text començant per l'esquerra
        IO.println(  "ABCDEC".indexOf('C')   );
        IO.println(  "ABCDEC".indexOf('c')   );

        //Busquem un caracter dins d'un text començant per l'esquerra però a aprtir d'una posició especificada
        IO.println(  "ABCDEC".indexOf('C', 0)   );
        IO.println(  "ABCDEC".indexOf('C', 1)   );
        IO.println(  "ABCDEC".indexOf('C', 2)   );
        IO.println(  "ABCDEC".indexOf('C', 3)   );
        IO.println(  "ABCDEC".indexOf('C', 4)   );
        IO.println(  "ABCDEC".indexOf('C', 5)   );
        IO.println(  "ABCDEC".indexOf('C', 6)   );
        IO.println(  "ABCDEC".indexOf('C', -1)   );

        //També es pot buscar un text dins d'un altre
        IO.println(  "ABCDEC".indexOf("CD")   );
        IO.println(  "ABCDEC".indexOf("DC")   );


    }


}

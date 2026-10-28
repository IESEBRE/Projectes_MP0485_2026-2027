package exemples;

public class CadenesIII {

    static void main() {
        //equalsIgnoreCase
        if("Hola".equalsIgnoreCase("hola")) IO.println("Són iguals");
        else  IO.println("Són diferents");

        //compareTo
        IO.println("Hola".compareTo("hola"));
        IO.println("H".compareTo("h"));
        IO.println("H".compareTo("H"));
        IO.println("h".compareTo("H"));
        if("Hola".compareTo("hola")>0) IO.println("Hola és més gran que hola");
        else  if("Hola".compareTo("hola")<0) IO.println("Hola és més menut que hola");
        else IO.println("Hoal i hola són iguals");

        //compareToIgnoreCase
        IO.println("Hola".compareToIgnoreCase("hola"));
        IO.println("H".compareToIgnoreCase("h"));
        IO.println("H".compareToIgnoreCase("H"));
        IO.println("h".compareToIgnoreCase("H"));

        //startsWith i endsWith
        if("Bon dia".startsWith("dia") || "Bon dia".endsWith("dia")) IO.println("Cadena trobada");

        //contains
        if("bon dia".contains("dia")) IO.println("Cadena trobada");

        //toUpperCase i toLowerCase
        if("HoLa".toUpperCase().equals("HOLA")) IO.println("Cadena trobada");
        if("HoLa".toLowerCase().equals("hola")) IO.println("Cadena trobada");

    }


}

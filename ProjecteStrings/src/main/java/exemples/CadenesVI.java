package exemples;

public class CadenesVI {

    static void main() {

        //Mètode trim --> treu d'una cadena els espais que té a dreta i esquerra
        IO.println("Vaig a treure "+"      els espais per ambdós costats      "+" d'una cadena.");
        IO.println("Vaig a treure "+"      els espais per ambdós costats      ".trim()+" d'una cadena.");
        IO.println("Vaig a treure "+"      els espais per ambdós costats      ".strip()+" d'una cadena.");

        //Mètode que retorna una cadena que és un tros d'una altra cadena
        IO.println("El teu nom és "+"Santi Sabaté".substring(0,5)+". Bon dia!");
        IO.println("El teu nom és "+"Santi Sabaté".substring(0,"Santi Sabaté".indexOf(' '))+". Bon dia!");

        IO.println("El teu cognom és "+"Santi Sabaté".substring(6)+". Bon dia!");
        IO.println("El teu nom és "+"Santi Sabaté".substring("Santi Sabaté".indexOf(' ')+1)+". Bon dia!");

        //Combinació de trim i substring
        IO.println("El teu nom és "+"       Santi Sabaté          ".trim().substring(0,5)+". Bon dia!");

        //Metode per concatenar textos
        String nom="Santi"+" "+"Sabaté";
        nom="Santi".concat(" ").concat("Sabaté");
    }
}

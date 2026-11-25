package exercicis;

public class Exercici5 {

    static void main() {
        int any;

        do{
            any=Integer.parseInt(IO.readln("Escriu un any >= 1582: "));
            if( any<1582 ) IO.println("Ha de ser superior o igual que el 1582!!");
            else break;
        }while(true);

        //Mostrem el missatge segons si l'any és no de traspàs
        if( bixest(any) ) IO.println("Sí, és bixest");
        else IO.println("No, és bixest");
    }

    public static boolean bixest(int any){

        return (any % 4 == 0 && any % 100 !=0 || any % 400 == 0) && any > 1582;
    }

}

package primerspassos;

public class AnyDeTraspas {

    void main(){
        //Declaració de variables
        int any;

        //Llegim l'any del teclat
        any=Integer.parseInt(IO.readln());

        //Mostrem el missatge segons si l'any és no de traspàs
        if( any % 4 == 0 && any % 100 !=0 || any % 400 == 0 ) IO.println("SI");
        else IO.println("NO");

        /*if( any % 4 == 0 && any % 100 !=0 ) IO.println("SI");
        else if( any % 400 == 0 ) IO.println("SI");
        else IO.println("NO");*/
    }
}

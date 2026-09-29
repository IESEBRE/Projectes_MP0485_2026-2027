package primerspassos;

public class Muntanyes {

    void main(){
        //Declaració de variables, aprofitant per llegir el valor
        int num1=Integer.parseInt(IO.readln()),
                num2=Integer.parseInt(IO.readln()),
                num3=Integer.parseInt(IO.readln()),
                num4=Integer.parseInt(IO.readln()),
                num5=Integer.parseInt(IO.readln());

        //Mostrem el resultat
        if( num1<num2 && num2>num3 && num3<num4 && num4>num5 || num1>num2 && num2<num3 && num3>num4 && num4<num5) IO.println("SI");
        else IO.println("NO");
    }

}

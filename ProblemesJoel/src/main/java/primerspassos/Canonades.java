package primerspassos;

public class Canonades {


    void main(){
        double longitud=Double.parseDouble(IO.readln()), cost=0.0;

        if(longitud>75.0)
            cost=(longitud-75)*5.0+50*4.0+25*3.0;
        else if(longitud>25.0)
            cost=(longitud-25)*4.0+25*3.0;
        else
            cost=longitud*3.0;

        IO.println(longitud+"m: "+cost+" euros");
    }


}

package primerspassos;

public class BarretHogwarts {

    void main(){

        switch(IO.readln()){
            case "Coratge":
                IO.println("Gryffindor");
                break;
            case "Coneixement":
                IO.println("Ravenclaw");
                break;
            case "Ambicio":
                IO.println("Slytherin");
                break;
            default:
                IO.println("Hufflepuff");
                break;
        }
    }
}

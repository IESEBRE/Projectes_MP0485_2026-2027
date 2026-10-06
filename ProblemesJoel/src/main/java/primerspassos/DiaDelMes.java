package primerspassos;

public class DiaDelMes {

    void main() {
        //Declaració de variables
        int dia = Integer.parseInt(IO.readln());

        //Si el dia del mes està entre el 6 i el 25 només cal dividir
        if (dia % 30 >= 6 && dia % 30 <= 25)
            IO.println(dia / 30 + 1);
        else if (dia <= 31) IO.println(1);
        else if (dia <= 59) IO.println(2);
        else if (dia <= 90) IO.println(3);
        else if (dia <= 120) IO.println(4);
        else if (dia <= 151) IO.println(5);
        else if (dia <= 181) IO.println(6);
        else if (dia <= 212) IO.println(7);
        else if (dia <= 243) IO.println(8);
        else if (dia <= 273) IO.println(9);
        else if (dia <= 304) IO.println(10);
        else if (dia <= 334) IO.println(11);
        else IO.println(12);
    }
}

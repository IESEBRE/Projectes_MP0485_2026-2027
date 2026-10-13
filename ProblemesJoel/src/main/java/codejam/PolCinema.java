package codejam;

import java.util.Scanner;

public class PolCinema {
    static void main() {
        int a = Integer.parseInt(IO.readln());
        int b = Integer.parseInt(IO.readln());
        if ((a > b && a <= b * 2) || (b > a && b <= a * 2))
            IO.println("SI");
        else IO.println("NO");
    }
}


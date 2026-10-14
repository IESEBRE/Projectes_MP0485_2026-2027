package introduccio;

public class LaMevaCosina {

    void main() {
        int cas1 = Integer.parseInt(IO.readln());
        int suma = 0;
        while (cas1 > 0) {
            cas1--;
            int sou = Integer.parseInt(IO.readln());
            if (sou >= 8000) {
                suma = suma + sou;
            }
        }
        IO.println(suma);
    }
}
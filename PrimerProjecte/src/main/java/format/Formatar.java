package format;

public class Formatar {

    void main(){

        System.out.format("%f  %f%n", Math.PI, Math.PI);
        System.out.format("%f  %.3f%n", Math.PI, Math.PI);
        System.out.format("%f  %1$.3f%n", Math.PI);
        //System.out.format("%f  %2$.3f%n", Math.PI);  --> 2$ causa una excfepció, ja que només tenim un valor
        System.out.format("%f  %1$+020.10f%n", Math.PI);
        System.out.format("%f  %1$020.10f%n", Math.PI);
        System.out.format("%f  %1$20.10f%n", Math.PI);

    }



}

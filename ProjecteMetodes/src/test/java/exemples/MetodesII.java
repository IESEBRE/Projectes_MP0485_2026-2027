package exemples;

//import static exemples.MetodesI.retornaEnter;

public class MetodesII {

    //Mètodes en paràmetres --> elements que posem dins dels parèntesis
    public static void main(String[] args) {
        //Declaració de variables
        int numero=47;

        //Un sol paràmetre anomenat args és un array d'Strings
        for (int i = 0; i < args.length; i++) {
            IO.println(String.format("El %dº valor del paràmetre val %s", i+1,args[i]));
        }

        metodeEnParametre(25);
        metodeEnParametre(numero);
        metodeEnParametre(MetodesI.retornaEnter());
        metodeEnParametre(Integer.parseInt(args[0]));
        metodeEnParametre(Integer.parseInt(args[1]));
        metodeEnParametre(Integer.parseInt(args[2]));
    }

    //Mètode meu que té un paràmetre
    public static void metodeEnParametre(int primerParametre){
        //int primerParametre=0;    --> no podem declarar variables en el mateix nom que un paràmetre
        //primerParametre=primerParametre+1;    --> podem operar en paràmetres igual que fem en variables
        IO.println(String.format("El número rebut %d és %s", primerParametre, primerParametre%2==0?"parell":"imparell"));

    }

    //Puc repetir el nom del mètode sempre i quan el nº o tipo dels paràmetres sigue diferent
    public static void metodeEnParametre(float primerParametre){
        //int primerParametre=0;    --> no podem declarar variables en el mateix nom que un paràmetre
        //primerParametre=primerParametre+1;    --> podem operar en paràmetres igual que fem en variables
        IO.println(String.format("El número rebut %f és %s", primerParametre, primerParametre%2==0?"parell":"imparell"));

    }


}

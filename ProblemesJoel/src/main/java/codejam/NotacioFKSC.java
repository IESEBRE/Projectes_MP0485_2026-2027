package codejam;

public class NotacioFKSC {

    static void main() {
        //Declaració de variables
        int numCasos = Integer.parseInt(IO.readln());

        //Bucle per tractar cada cas
        while (numCasos > 0) {
            //Tractar cas actual
            char tipo=IO.readln().charAt(0);
            String linia=IO.readln().trim();//trec els espais a esquerra i dreta per si un cas

            //Anem a tractar cada linia
            int ini=0;                      //apuntarà a l'inici de cada paraula
            int fi=0;                       //apuntarà a l'espai en blanc que hi ha a continuació d'una paraula
                                            //o al final de la frase quan val -1

            do{
                //Busquem el següent espai en blanc per actualitzar el fi
                fi=linia.indexOf(' ', ini);

                //Mirem si estem al final de la línia o no
                if(fi==-1){     //estem al final de la línia
                    //Mostro la primera lletra de la paraula segons la notació
                    IO.print(tipo=='P' || (tipo=='C' && ini!=0)? linia.substring(ini,ini+1).toUpperCase():
                            linia.substring(ini,ini+1).toLowerCase());
                    //Mostro la resta de la paraula segons la notació
                    IO.println(linia.substring(ini+1).toLowerCase());
                    //Sortim del bucle ja que estem al final de la linia
                    break;
                }else{          //estem pel mig de la línia
                    //Mostro la primera lletra de la paraula segons la notació
                    IO.print(tipo=='P' || (tipo=='C' && ini!=0)? linia.substring(ini,ini+1).toUpperCase():
                            linia.substring(ini,ini+1).toLowerCase());
                    //Mostro la resta de la paraula segons la notació
                    IO.print(linia.substring(ini+1, fi).toLowerCase());
                    //Mostrem el substitut de l'espai en blanc segons la notació
                    IO.print(tipo=='K' ? "-" : (tipo=='S' ? "_" : "") );
                }

                //Fem que ini apunte al començament de la següent paraula
                ini=fi+1;

            }while(true);



            //Decrementem el número de casos
            numCasos--;
        }

    }



}

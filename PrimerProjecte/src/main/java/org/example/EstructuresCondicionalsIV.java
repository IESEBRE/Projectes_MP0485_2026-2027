package org.example;

public class EstructuresCondicionalsIV {


    void main(){
        //Declaració de variables
        int mes, ultimDiaMes;

        //Demanem a l'usuari que introduisque un numero de mes
        mes=Integer.parseInt(IO.readln("Escriu un número de mes entre 1 i 12: "));

        //Actualitzem el valor de l'últim dia del mes triat
        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)
            ultimDiaMes=31;
        else if(mes==2){
            //Suposem que no hi ha anys de traspàs
            ultimDiaMes=28;
        }else if(mes==4 || mes==6 || mes==9 || mes==11)
            ultimDiaMes=30;
        //Si el mes no existix poso un valor que tampoc existix...
        else ultimDiaMes=-1;

        //OPERADOR CONDICIONAL TERNARI

        //En els 3 casos anteriors acabem assignant un valor diferent a la mateixa variable
        ultimDiaMes=(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 ? 31 :
                (mes==2 ? 28 : (mes==4 || mes==6 || mes==9 || mes==11 ? 30 : -1)));


        if(mes%2==0) System.out.println("Número de mes parell");
        else System.out.println("Número de mes imparell");

        System.out.println( mes%2==0 ? "Número de mes parell" : "Número de mes imparell");

    }





}

package introduccio;

public class ComptadorNotes {


    void main(){
        //Declaració de variable
        int nota, cExc, cNot, cBe, cSuf, cIns, cMds, cVal, suma;

        //Inicialització de variables
        cExc=cNot=cBe=cSuf=cIns=cMds=cVal=suma=0;   //Inicialitzem totes les variables a 0

        //Comencem a llegir
        nota=Integer.parseInt(IO.readln());
        while(nota != -1){
            //Comprovem si la nota és vàlida
            if(nota>=0 && nota<=10) {
                switch (nota) {
                    case 10, 9:
                        cExc++;
                        break;
                    case 8, 7:
                        cNot++;
                        break;
                    case 6:
                        cBe++;
                        break;
                    case 5:
                        cSuf++;
                        break;
                    case 4:
                        cIns++;
                        break;
                    default:
                        cMds++;
                }
                //Incrementen les notes vàlides i sumen la nota
                cVal++;
                suma+=nota;
            }
            //Llegim la següent nota
            nota=Integer.parseInt(IO.readln());

        }       //Fi del while

        //Una vegada sortim del while mostrem el resultat
        //IO.println("NOTES: "+cVal+" MITJANA: "+( suma*1.0F/cVal )+" E: "+cExc+" N: "+cNot+" B: "+cBe+" S: "+cSuf+" I: "+cIns+" MD: "+cMds);
        //El mateix fent un CASTING --> (float)
        //IO.println("NOTES: "+cVal+" MITJANA: "+( (float)suma/cVal )+" E: "+cExc+" N: "+cNot+" B: "+cBe+" S: "+cSuf+" I: "+cIns+" MD: "+cMds);
        //El mateix utilitzant la instrucció System.out.format() o System.out.printf()
        System.out.format("NOTES: %d MITJANA: %.7f E: %d N: %d B: %d S: %d I: %d MD: %d", cVal, (float)suma/cVal, cExc, cNot, cBe, cSuf, cIns, cMds);

    }
}

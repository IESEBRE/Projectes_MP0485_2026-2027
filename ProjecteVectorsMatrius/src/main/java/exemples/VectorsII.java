package exemples;

public class VectorsII {

    static void main() {
        //Declaració de variables
        boolean[] vectorBools={false, true, true, false};

        //Com se recorrer un vector
        for (int i = 0; i < vectorBools.length; i++) {      //length indica el número de caselles

            if(vectorBools[i]) IO.println("La casella conté un true");
            else  IO.println("La casella conté un false");

            //Canviem el valor de la casella al seu contrari
            vectorBools[i]=!vectorBools[i];
        }

        for (int i = 0; i < vectorBools.length; i++) {      //length indica el número de caselles
            if(vectorBools[i]) IO.println("La casella conté un true");
            else  IO.println("La casella conté un false");
        }

        //No podem accedir a caselles inexistents --> index incorrecte
        vectorBools[vectorBools.length]=true;   //index superior o igual a length
        vectorBools[-1]=true;                   //index inferior a 0



    }




}

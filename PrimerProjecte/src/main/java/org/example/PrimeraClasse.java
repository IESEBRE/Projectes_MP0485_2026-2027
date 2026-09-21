package org.example;

//Només hi ha una classe PUBLIC per fitxer,
// i el nom del fitxer ha de coincidir amb el nom de la classe PUBLIC
public class PrimeraClasse {

    void main(){
        IO.println("Estic a la primera classe!!!");

        //Imprimim el text sense afegir salt de línia
        IO.print("Primera paraula, ");
        IO.print("Segona paraula");
    }
}

//Podem afegir tantes classes com vulguem però no poden ser PUBLIC
class SegonaClasse {
}

package Ćwiczenia;

public class Main3 {

    public static void main(String[] args) {

        //Zadanie2: zsumować liczby w tablicy 10 elementów

        //tablica liczb - 10 elementów
        int[] Liczby = {4,2,5,76,8,2,234,346,32,1};
        //zmienna, która będzie przechowywać tą naszą sumę
        int suma = 0;

        //Pętla for dla int i = 0; i < Liczby.length; i++
        for (int i = 0; i < Liczby.length; i++) {
            // Co będzie się działo? suma+=Liczby[i]
            suma+=Liczby[i];
        }
        // Ukazanie wyniku :) poprzez "Suma tych liczb wynosi: " + suma
        System.out.println("Suma tych liczb wynosi: " + suma);
    }
}

package Cezar;

import java.util.Scanner;

public class Cezar {

    public static void main(String[] args) {

        System.out.println("Program szyfrujący tekst za pomocą Szyfru cezara");

        System.out.println("Podaj tekst do zaszyfrowania: ");

        // inicjalizacja skanera, który będzie pobierać wartości naszych zmiennych
        Scanner scanner = new Scanner(System.in);

        // pobiera tekst od człowieka, zamienia na duże litery
        String txt = scanner.nextLine().toUpperCase();

        System.out.println("Podaj klucz szyfrowania (ilość przesunięć): ");

        // pobieram liczbe przesuniec od uzytkownika (np. 3)
        int n = scanner.nextInt();

        // tworzymy zmienna pomocniczą , która przechowa utworzony tekst
        String encrypted = "";

        // iterujemy przez wprowadzony tekst
        for(int i =0; i < txt.length(); i++) {

            // pobieramy znak na iterowanej pozycji i przesuwamy o wybraną przez człowieka ilość znaków
            char c = (char) (txt.charAt(i) + n);

            // jeżeli jednak wyjdziemy "poza alfabet", to cofamy się o 26 znaków
            if(c > 'Z')

                c -= 26;
            // dopisujemy przesunięty znak do naszej zmiennej
            encrypted += c;
        }
        //wyświetlamy wynik
        System.out.println("Twój tekst po szyfrowaniu cezara wygląda tak: " + encrypted);

        //zwalniamy zasoby
        scanner.close();
    }
}

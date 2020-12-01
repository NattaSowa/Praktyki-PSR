package Ćwiczenia;

    public class Main3_3 {

        public static void main3_3(String[] args) {
            //iczby parzyste w przedziale od 1 do 10
            for (int i = 1; i <= 346; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }

        }

        // Zwracanie sumy liczb zawartych w tablicy
        public static int Podsumowanie_Tablicy(int[] tablica) {
            // Dodanie do siebie wszystkich liczb w tablicy
            int suma = 0;
            for(int j : tablica) {
                suma = suma + j;
            }
            return suma;
        }

        public static void main(String[] args) {
            // Testowanie podanej funkcji
            int[] t = {4,2,5,76,8,2,234,346,32,1};

            System.out.println(Podsumowanie_Tablicy(t));
        }
    }



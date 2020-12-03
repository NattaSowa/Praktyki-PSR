package Ćwiczenia;

    import java.util.Scanner;

    public class Main3_5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj a i b: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            mz(a, b);
        }
        public static void mz(double a, double b){
            if (a <= 0) {
                System.out.print("Brak miejsca zerowego, funkcja jest stała");
            } else {
                double x = -(b / a);
                System.out.println("Miejscem zerowym funkcji jest liczba: " + x);
            }
        }
    }


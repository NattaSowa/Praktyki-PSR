package Dice;

public class Main {

    public static int roll(int amountOfFaces) {
        return new DandD(amountOfFaces).draw();
    }

    public static void main(String[] args) {
        // Rzuca kośćmi i wyświetla wynik
        System.out.println("Rzut kością K4: " + roll(4));
        System.out.println("Rzut kością K6: " + roll(6));
        System.out.println("Rzut kością K8: " + roll(8));
        System.out.println("Rzut kością K10: " + roll(10));
        System.out.println("Rzut kością K12: " + roll(12));
        System.out.println("Rzut kością K20: " + roll(20));
        System.out.println("Rzut kością K100: " + roll(100));
    }
}

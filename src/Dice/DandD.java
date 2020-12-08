package Dice;

import java.security.SecureRandom;
import java.util.Random;

public class DandD {
    private int amountOfFaces;

    public DandD(int amountOfFaces) {
        this.amountOfFaces = amountOfFaces;
    }

    // Zwraca minimalną liczbę możliwą do wylosowania (zawsze 1)
    public int getMinNumber() {
        return 1;
    }

    // Zawraca liczbę ścianek (i jednocześnie maksymalną liczbę możliwą do wylosowania)
    public int getAmountOfFaces() {
        return amountOfFaces;
    }

    // Rzut kością
    public int draw() {
        return new SecureRandom().nextInt(amountOfFaces + 1);
    }
}

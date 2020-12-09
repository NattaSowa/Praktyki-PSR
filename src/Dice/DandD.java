package Dice;

import java.security.SecureRandom;

public class DandD {
    private int n;
    SecureRandom random;

    public DandD(int n){
        this.n = n;
        random = new SecureRandom();
    }

    public int roll() {
        return this.random.nextInt(n) + 1;
    }
}

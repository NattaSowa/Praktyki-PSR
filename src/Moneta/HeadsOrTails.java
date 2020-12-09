package Moneta;

import java.security.SecureRandom;

    public class HeadsOrTails {
        public static void main(String[] args) {
            roll();
        }
        public static void roll(){
            SecureRandom random = new SecureRandom();
            int i = random.nextInt(2);
            i++;
            if(i==2){
                System.out.print("Orzeł");
            }
            else if(i==1){
                System.out.print("Reszka");
            }
        }

    }


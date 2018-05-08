package main;

import java.util.HashMap;

public class coinChanger {

    private static String[] coinNames = {"Quarter_Dollar","Dime","Nickel","Penny"};
    private static int[] coinValues = {25,10,5,1};

    public static String changeCoins(int amount) {

        int counter = amount;
        String coinsReturned = "";

        for (int i = 0; i < coinValues.length; i++) {
           while (counter >= coinValues[i]) {
               coinsReturned += coinNames[i];
               counter -= coinValues[i];
           }
        }
        return coinsReturned;
    }

}

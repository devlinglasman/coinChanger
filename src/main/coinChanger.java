package main;

import java.util.HashMap;

public class coinChanger {

    private static final HashMap<Integer, String> COINS = createHashMap();

    private static HashMap<Integer, String> createHashMap() {
        HashMap<Integer, String> result = new HashMap<>();
        result.put(1, "Penny");
        result.put(5, "Nickel");
        result.put(10, "Dime");
        result.put(25, "Quarter_Dollar");
        return result;
    }

    public static String getCoinsReturned(int counter) {
        StringBuilder coinsReturned = new StringBuilder();
        while (counter > 0) {
            int lookup = determineLookupFrom(counter);
            coinsReturned.append(COINS.get(lookup));
            counter -= lookup;
        }
        return coinsReturned.toString();
    }

    private static int determineLookupFrom(int counter) {
        int largestKey = 1;
        for (int key : COINS.keySet()) {
            if (key > largestKey && key <= counter) {
                largestKey = key;
            }
        }
        return largestKey;
    }
}

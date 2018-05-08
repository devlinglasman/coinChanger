package main;

public class coinChanger {

    public static String changeCoins(int amount) {
        String coinsReturned = "";
        for (int i = 0; i < amount; i++) {
           coinsReturned += "Penny";
        }
        return coinsReturned;
    }

}

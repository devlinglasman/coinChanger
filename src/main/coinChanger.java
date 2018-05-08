package main;

public class coinChanger {

    public static String changeCoins(int amount) {
        int counter = amount;
        String coinsReturned = "";
        if (amount > 4) {
            coinsReturned += "Nickel";
            counter -= 5;
        }
        for (int i = 0; i < counter; i++) {
            coinsReturned += "Penny";
        }
        return coinsReturned;
    }

}

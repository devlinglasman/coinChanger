package test;

import main.coinChanger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testCoinChanger {

    @Test
    public void test1() {
        coinChanger test = new coinChanger();
        assertEquals("Penny", test.changeCoins(1));
    }

    @Test
    public void test2() {
        coinChanger test = new coinChanger();
        assertEquals("PennyPenny", test.changeCoins(2));
    }
}

package test;

import main.coinChanger;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testCoinChanger {

    private static final HashMap<Integer,String> TESTS = createHashMap();

    private static HashMap<Integer,String> createHashMap() {
        HashMap<Integer,String> result = new HashMap<>();
        result.put(1,"Penny");
        result.put(2,"PennyPenny");
        result.put(51,"Half_DollarPenny");
        result.put(56,"Half_DollarNickelPenny");
        return result;
    }

    private void assertChanger(String coinsReturned, int amount) {
        assertEquals(coinsReturned, coinChanger.getCoinsReturned(amount));
    }

    @Test
    public void alltests() {
        for (Integer amount : TESTS.keySet()) {
            assertChanger(TESTS.get(amount), amount);
        }
    }

    @Test
    public void test2() {
        assertChanger("PennyPenny",2);
    }

    @Test
    public void test3() {
        assertChanger("PennyPennyPenny",3);
    }

    @Test
    public void test4() {
        assertChanger("PennyPennyPennyPenny",4);
    }

    @Test
    public void test5() {
        assertChanger("Nickel",5);
    }

    @Test
    public void test6() {
        assertChanger("NickelPenny",6);
    }

    @Test
    public void test8() {
        assertChanger("NickelPennyPennyPenny",8);
    }

    @Test
    public void test10() {
        assertChanger("Dime",10);
    }

    @Test
    public void test17() {
        assertChanger("DimeNickelPennyPenny",17);
    }

    @Test
    public void test23() {
        assertChanger("DimeDimePennyPennyPenny",23);
    }

    @Test
    public void test29() {
        assertChanger("Quarter_DollarPennyPennyPennyPenny",29);
    }
}

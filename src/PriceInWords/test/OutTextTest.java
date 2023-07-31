package PriceInWords.test;

import PriceInWords.Consumer.Print;
import PriceInWords.Consumer.PrintImp;
import PriceInWords.Convert.Currency;
import PriceInWords.Convert.Nums;
import PriceInWords.Convert.NumsRus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class OutTextTest {
    private Nums nums = new NumsRus();
    private Print print = new PrintImp();

    private Map<Integer, String> map = new HashMap<>();


    @Test
    void numText() {
        map.put(0, "ноль рублей");
        map.put(1, "один рубль");
        map.put(2, "два рубля");
        map.put(5, "пять рублей");
        map.put(11, "одиннадцать рублей");
        map.put(12, "двенадцать рублей");
        map.put(15, "пятнадцать рублей");
        map.put(20, "двадцать рублей");
        map.put(21, "двадцать один рубль");
        map.put(23, "двадцать три рубля");
        map.put(22, "двадцать два рубля");
        map.put(25, "двадцать пять рублей");
        map.put(30, "тридцать рублей");
        map.put(100, "сто рублей");
        map.put(101, "сто один рубль");
        map.put(102, "сто два рубля");
        map.put(110, "сто десять рублей");
        map.put(111, "сто одиннадцать рублей");
        map.put(112, "сто двенадцать рублей");
        map.put(115, "сто пятнадцать рублей");
        map.put(120, "сто двадцать рублей");
        map.put(121, "сто двадцать один рубль");
        map.put(122, "сто двадцать два рубля");
        map.put(125, "сто двадцать пять рублей");
        map.put(1002, "одна тысяча два рубля");
        map.put(9000, "девять тысяч рублей");
        map.put(10_534, "десять тысяч пятьсот тридцать четыре рубля");
        map.put(150_010, "сто пятьдесят тысяч десять рублей");
        map.put(1_000_531, "один миллион пятьсот тридцать один рубль");
        map.put(1_000_001, "один миллион один рубль");
        map.put(1_000_101, "один миллион сто один рубль");
        map.put(1_000_999, "один миллион девятьсот девяносто девять рублей");
        map.put(1_051_021, "один миллион пятьдесят одна тысяча двадцать один рубль");
        map.put(1_134_002, "один миллион сто тридцать четыре тысячи два рубля");
        map.put(2_000_000, "два миллиона рублей");
        map.put(2_002_800, "Много рублей");


        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String actual = nums.convert(entry.getKey(), false) + Currency.RUB.curr(entry.getKey());

            Assertions.assertEquals(entry.getValue(), actual);
        }

        Assertions.assertEquals("Сто рублей.", print.printOut(map.get(100)));
    }
}

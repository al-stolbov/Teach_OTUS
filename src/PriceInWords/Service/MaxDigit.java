package PriceInWords.Service;

public class MaxDigit implements Validator {

    public static final int MAX_INT = 2_000_000;

    @Override
    public boolean valid(int x) {
        return x <= MAX_INT;
    }
}

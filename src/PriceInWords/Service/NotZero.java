package PriceInWords.Service;

public class NotZero implements Validator{

    @Override
    public boolean valid(int x) {
        return x >= 0;
    }
}

package PriceInWords;

import PriceInWords.Consumer.Console;
import PriceInWords.Consumer.ConsoleImp;
import PriceInWords.Consumer.Print;
import PriceInWords.Consumer.PrintImp;
import PriceInWords.Convert.Currency;
import PriceInWords.Convert.CurrencyRub;
import PriceInWords.Convert.Nums;
import PriceInWords.Convert.NumsRus;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Print print = new PrintImp();
        Console console = new ConsoleImp(print);
        Nums nums = new NumsRus();
        Currency currency = new CurrencyRub();


        while (true) {
            int digit = console.enter();
            print.printOut(nums.convert(digit, false) + currency.curr(digit));
        }
    }
}

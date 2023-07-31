package PriceInWords;

import PriceInWords.Consumer.Console;
import PriceInWords.Consumer.ConsoleImp;
import PriceInWords.Consumer.Print;
import PriceInWords.Consumer.PrintImp;
import PriceInWords.Convert.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Print print = new PrintImp();
        Console console = new ConsoleImp(print);
        Nums nums = new NumsRus();



        while (true) {
            int digit = console.enter();
            print.printOut(nums.convert(digit, false) + Currency.RUB.curr(digit));
        }
    }
}

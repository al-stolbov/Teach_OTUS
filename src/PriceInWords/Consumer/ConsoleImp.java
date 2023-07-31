package PriceInWords.Consumer;

import PriceInWords.Service.MaxDigit;
import PriceInWords.Service.NotZero;
import PriceInWords.Service.Validator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static PriceInWords.Service.MaxDigit.MAX_INT;

public class ConsoleImp implements Console {

    private final Print print;
    private final Validator maxDigit = new MaxDigit();
    private final Validator notZero = new NotZero();

    public ConsoleImp(Print print) {
        this.print = print;
    }

    @Override
    public int enter() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            print.printOut("Введите целое положительное число не более " + MAX_INT + " или 'Выход'.");

            String enter = reader.readLine();
            if (enter.equalsIgnoreCase("выход")) {
                exit(0);
            }
            try {
                int num = Integer.parseInt(enter);
                if (maxDigit.valid(num) && notZero.valid(num)) {
                    return num;
                }
            } catch (NumberFormatException e) {
                print.printOut("Ошибка введенного значения.");
            }
        }
    }

    @Override
    public void exit(int status) {
        System.exit(status);
    }
}

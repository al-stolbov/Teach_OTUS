package PriceInWords.Consumer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleImp implements Console {
    private final int MAX_INT = 2_000_000;
    private final Print print;

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
                if (num <= MAX_INT && num >= 0) {
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

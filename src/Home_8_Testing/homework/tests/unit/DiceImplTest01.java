package Home_8_Testing.homework.tests.unit;

import Home_8_Testing.homework.src.main.java.ru.otus.game.DiceImpl;

public class DiceImplTest01 {

    DiceImpl dice = new DiceImpl();

    public void testRollForN1() {
        String scenario = "V1. Тест возвращаемого диапазона.";
        // Делаем 10 бросков чтобы не попасть на случайное совпадение.
        for (int countCast = 0; countCast < 10; countCast++) {
            var cube = dice.roll();
            try {
                if (cube > 6 || cube < 1) {
                    throw new Throwable("Значение кости за пределами диапазона (1-6).");
                }
                System.out.printf("\"%s\" passed %n", scenario);
            } catch (Throwable e) {
                System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
            }
        }
    }
}

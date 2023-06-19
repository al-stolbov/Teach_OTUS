package Home_8_Testing.homework.tests.unit;

import Home_8_Testing.homework.src.main.java.ru.otus.game.DiceImpl;

public class DiceImplTest02 {
    DiceImpl dice = new DiceImpl();

    public void testRollForN2() {
        String scenario = "V2. Тест возвращаемого типа числа кости.";
        var cube = dice.roll();

        int x = (int) cube;

        String strX = String.valueOf(x);
        String strCube = String.valueOf(cube);

        try {
            if (!strX.equals(strCube)) {
                throw new Throwable("Тип числа кости не соответствует заданному.");
            }
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}

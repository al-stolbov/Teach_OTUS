package Home_8_Testing.demo.src.main.java.ru.otus.demo04.tests.unit;

import Home_8_Testing.demo.src.main.java.ru.otus.assertions.Assertions;
import Home_8_Testing.demo.src.main.java.ru.otus.demo04.app.service.FactorialCalculatorV02;

public class FactorialCalculatorTest03 {

    // Состояние на момент написания теста
    private final FactorialCalculatorV02 factorialCalculator = new FactorialCalculatorV02();

    // После починки теста
    //private final FactorialCalculatorV03 factorialCalculator = new FactorialCalculatorV03();

    public void testFactorialCalculationForPositiveN() {
        String scenario = "V3. Тест расчета факториала положительного числа";
        try {
            int expected = 6;
            int actual = factorialCalculator.factorial(3);
            Assertions.assertEquals(expected, actual);

            expected = 720;
            actual = factorialCalculator.factorial(6);
            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testFactorialCalculationForN0() {
        String scenario = "V3. Тест расчета факториала числа 0";
        try {
            int expected = 1;
            int actual = factorialCalculator.factorial(0);
            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}

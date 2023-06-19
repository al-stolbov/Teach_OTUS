package Home_8_Testing.demo.src.main.java.ru.otus.demo03.tests.unit;

import Home_8_Testing.demo.src.main.java.ru.otus.assertions.Assertions;
import Home_8_Testing.demo.src.main.java.ru.otus.demo03.app.service.FactorialCalculatorImpl;

public class FactorialCalculatorTest {

    private final FactorialCalculatorImpl factorialCalculator = new FactorialCalculatorImpl();

    public void testFactorialCalculationWithPositiveN() {
        String scenario = "Тест расчета с положительным n";
        try {
            int actual = factorialCalculator.factorial(2);
            Assertions.assertEquals(2, actual);

            actual = factorialCalculator.factorial(3);
            Assertions.assertEquals(6, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}

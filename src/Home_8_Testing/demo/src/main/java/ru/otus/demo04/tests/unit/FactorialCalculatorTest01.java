package Home_8_Testing.demo.src.main.java.ru.otus.demo04.tests.unit;

import Home_8_Testing.demo.src.main.java.ru.otus.assertions.Assertions;
import Home_8_Testing.demo.src.main.java.ru.otus.demo04.app.service.FactorialCalculatorV01;

public class FactorialCalculatorTest01 {
    // До того как мы начали писать тест ничего не было и тест не проходил)

    // После починки теста
    private final FactorialCalculatorV01 factorialCalculator = new FactorialCalculatorV01();

    public void testFactorialCalculationForN3() {
        String scenario = "V1. Тест расчета факториала числа 3";
        try {
            int expected = 6;
            int actual = factorialCalculator.factorial(3);
            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}

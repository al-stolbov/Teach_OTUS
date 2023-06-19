package Home_8_Testing.demo.src.main.java.ru.otus.demo02.tests;

import Home_8_Testing.demo.src.main.java.ru.otus.demo02.tests.unit.FactorialCalculatorTest;

public class AllTests {
    public static void main(String[] args) {
        new FactorialCalculatorTest().testFactorialCalculationWithPositiveN();
    }
}

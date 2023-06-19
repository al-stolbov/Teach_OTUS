package Home_8_Testing.demo.src.main.java.ru.otus.demo03.tests;

import Home_8_Testing.demo.src.main.java.ru.otus.demo03.tests.unit.FactorialApplicationTest;
import Home_8_Testing.demo.src.main.java.ru.otus.demo03.tests.unit.FactorialCalculatorTest;
import Home_8_Testing.demo.src.main.java.ru.otus.demo03.tests.unit.IOStreamsServiceTest;

public class AllTests {
    public static void main(String[] args) {
        new FactorialCalculatorTest().testFactorialCalculationWithPositiveN();

        new IOStreamsServiceTest().testInput();
        new IOStreamsServiceTest().testOutput();
        new IOStreamsServiceTest().testFormattedOutput();

        new FactorialApplicationTest().testAppFlow();
    }
}

package Home_8_Testing.demo.src.main.java.ru.otus.demo03.tests.unit;

import Home_8_Testing.demo.src.main.java.ru.otus.assertions.Assertions;
import Home_8_Testing.demo.src.main.java.ru.otus.demo03.app.service.FactorialApplication;
import Home_8_Testing.demo.src.main.java.ru.otus.demo03.app.service.FactorialCalculator;
import Home_8_Testing.demo.src.main.java.ru.otus.demo03.app.service.IOService;
import Home_8_Testing.demo.src.main.java.ru.otus.demo03.tests.unit.fakes.FactorialCalculatorSpy;
import Home_8_Testing.demo.src.main.java.ru.otus.demo03.tests.unit.fakes.IOServiceSpy;

import java.util.ArrayList;
import java.util.List;

public class FactorialApplicationTest {

    public void testAppFlow() {
        String scenario = "Тест работы приложения";
        try {
            List<String> expectedFlow = List.of("Введите n или команду \"exit\"",
                    "inputString вызван впервые",
                    "Вызов расчета факториала при n = 53",
                    "53! = 2021",
                    "Введите n или команду \"exit\"",
                    "inputString вызван второй раз");
            List<String> actualFlow = new ArrayList<>();

            IOService ioServiceSpy = new IOServiceSpy(actualFlow);
            FactorialCalculator factorialCalculatorSpy = new FactorialCalculatorSpy(actualFlow);

            FactorialApplication application = new FactorialApplication(ioServiceSpy, factorialCalculatorSpy);
            application.run();

            Assertions.assertEquals(expectedFlow.size(), actualFlow.size());
            for (int i = 0; i < expectedFlow.size(); i++) {
                Assertions.assertEquals(expectedFlow.get(i), actualFlow.get(i));
            }

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}

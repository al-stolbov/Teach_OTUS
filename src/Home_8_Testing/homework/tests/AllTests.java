package Home_8_Testing.homework.tests;

import Home_8_Testing.homework.tests.unit.DiceImplTest01;
import Home_8_Testing.homework.tests.unit.DiceImplTest02;
import Home_8_Testing.homework.tests.unit.GameTest01;
import Home_8_Testing.homework.tests.unit.GameTest02;

public class AllTests {

    public static void main(String[] args) {

        new DiceImplTest01().testRollForN1();
        new DiceImplTest02().testRollForN2();

        new GameTest01().testPlayGame01();
        new GameTest02().testPlayGame02();
    }
}


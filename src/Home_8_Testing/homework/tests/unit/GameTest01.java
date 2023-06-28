package Home_8_Testing.homework.tests.unit;

import Home_8_Testing.homework.src.main.java.ru.otus.game.*;

public class GameTest01 {
    Dice dice = new DiceImplTest();
    GameWinnerReturnTest gameWinnerReturnTest = new GameWinnerReturnTest();
    Game game = new Game(dice, gameWinnerReturnTest);


    public void testPlayGame01() {
        String scenario = "V3. Тест определения победителя при ничьей.";
        var test01 = new Player("Test01");
        var test02 = new Player("Test02");
        // Бросаем кости зная, что будет одинаковый результат, т.е победителя быть не может.
        game.playGame(test01, test02);

        try {
            if (gameWinnerReturnTest.getWinner() != null) {
                throw new Throwable("Результат костей одинаковый.");
            }
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    private class DiceImplTest implements Dice {
        @Override
        public int roll() {
            return 6;
        }
    }
}

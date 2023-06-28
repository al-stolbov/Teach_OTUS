package Home_8_Testing.homework.tests.unit;

import Home_8_Testing.homework.src.main.java.ru.otus.game.*;

public class GameTest02 {
    private int rezult = 1;
    Dice dice = new DiceImplTest();
    GameWinnerReturnTest gameWinnerReturnTest = new GameWinnerReturnTest();
    Game game = new Game(dice, gameWinnerReturnTest);


    public void testPlayGame02() {
        String scenario = "V4. Тест определения победителя.";
        var test01 = new Player("Test01");
        var test02 = new Player("Test02");
        // Бросем кости и знаем результат (test01 = 1 и test02 = 2)
        game.playGame(test01, test02);

        try {
            if (gameWinnerReturnTest.getWinner() != test02) {
                throw new Throwable("Победитель определен неверно.");
            }
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    private class DiceImplTest implements Dice {
        @Override
        public int roll() {
            return rezult++;
        }
    }
}

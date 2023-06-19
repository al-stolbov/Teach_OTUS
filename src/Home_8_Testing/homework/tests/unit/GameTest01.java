package Home_8_Testing.homework.tests.unit;

import Home_8_Testing.homework.src.main.java.ru.otus.game.*;

public class GameTest01 {
    private final int REZULT = 6;
    DiceImpl dice = new DiceImpl();
    GameWinnerConsolePrinter gameWinnerConsolePrinter = new GameWinnerConsolePrinter();
    Game game = new Game(dice, gameWinnerConsolePrinter);


    public void testPlayGame01() {
        String scenario = "V3. Тест определения победителя при ничьей.";
        var test01 = new Player("Test01");
        var test02 = new Player("Test02");
        var win = game.playGame(test01, test02);

        Player winner = (REZULT == REZULT) ? null : win;

        try {
            if (winner != win) {
                throw new Throwable("Результат костей одинаковый.");
            }
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}

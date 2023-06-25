package Home_8_Testing.homework.tests.unit;

import Home_8_Testing.homework.src.main.java.ru.otus.game.GameWinnerPrinter;
import Home_8_Testing.homework.src.main.java.ru.otus.game.Player;

public class GameWinnerReturnTest implements GameWinnerPrinter {
    private Player playerWinner;
    @Override
    public void printWinner(Player winner) {
        playerWinner = winner;
    }
    public Player getWinner() {
        return playerWinner;
    }
}


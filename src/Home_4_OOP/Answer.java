package Home_4_OOP;

public class Answer {
    private int evaluationResponse;
    private final int BAL = 5;

    private String[] answers = {
            "30",
            "31",
            "31"
    };

    public boolean getAnswer(int numQuestion, String answerUser) {
        if (numQuestion <= answers.length && numQuestion > 0) {
            return answerUser.equals(answers[numQuestion - 1]);
        }
        return false;
    }

    public void printRezult(boolean status) {
        if (status) {
            System.out.println("Ответ верный.");
        } else {
            System.out.println("Неправильно.");
        }
    }

    public void printRezult() {
        System.out.println("Опрос окончен, верных ответов: " + evaluationResponse / BAL + "\nОценка: " + evaluationResponse);
    }

    public void countVal(boolean status) {
        if (status) {
            evaluationResponse += BAL;
        }
    }


}

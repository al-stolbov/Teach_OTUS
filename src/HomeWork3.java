import java.util.Scanner;

public class HomeWork3 {
    static Scanner scan = new Scanner(System.in);

    private static int evaluationResponse;
    private static final int BAL = 5;

    private static String[][] questionsTestingAndAnswer = {
            {"Сколько дней в ноябре ?", "31", "28", "30", "29"},
            {"Сколько дней в декабре ?", "25", "31", "29", "30"},
            {"Сколько дней в январе ?", "31", "29", "30", "28", "20"}};

    private static String[] answers = {
            "30",
            "31",
            "31"
    };

    public static String validAnswer(int question, String answer) {
        for (int numAnswer = 0; numAnswer < questionsTestingAndAnswer[question].length; numAnswer++) {
            if (questionsTestingAndAnswer[question][numAnswer].equals(answer)) {
                return answer;
            }
        }
        System.out.println("Такого варианта нет, выберите из перечисленных.");
        answer = scan.next();
        return validAnswer(question, answer);
    }


    public static int countVal(int numQuestion, String answer) {
        if (answer.equals(answers[numQuestion])) {
            return BAL;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        for (int numQuestions = 0; numQuestions < questionsTestingAndAnswer.length; numQuestions++) {
            for (int numAnswers = 0; numAnswers < questionsTestingAndAnswer[numQuestions].length; numAnswers++) {
                System.out.println(questionsTestingAndAnswer[numQuestions][numAnswers]);

                if (numAnswers == questionsTestingAndAnswer[numQuestions].length - 1) {
                    String rezult = scan.next();
                    rezult = validAnswer(numQuestions, rezult);
                    evaluationResponse += countVal(numQuestions, rezult);
                }
            }
        }
        System.out.println("Опрос окончен, верных ответов: " + evaluationResponse / BAL + "\nОценка: " + evaluationResponse);
    }
}



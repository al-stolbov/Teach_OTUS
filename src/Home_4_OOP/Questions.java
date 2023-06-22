package Home_4_OOP;

import java.util.Scanner;

public class Questions {
    private String[][] questionsTestingAndVersion = {
            {"Сколько дней в ноябре ?", "31", "28", "30", "29"},
            {"Сколько дней в декабре ?", "25", "31", "29", "30"},
            {"Сколько дней в январе ?", "31", "29", "30", "28", "20"}};

    public int getCountQuestions() {
        return questionsTestingAndVersion.length;
    }

    public String validAnswerVersion(int question, String answer, Scanner scan) {
        for (int numAnswer = 0; numAnswer < questionsTestingAndVersion[question - 1].length; numAnswer++) {
            if (questionsTestingAndVersion[question - 1][numAnswer].equals(answer)) {
                return answer;
            }
        }
        System.out.println("Такого варианта нет, выберите из перечисленных.");
        answer = scan.next();
        return validAnswerVersion(question, answer, scan);
    }


    public void printQuestionAndVersion(int numQuestion) {
        if (numQuestion > questionsTestingAndVersion.length + 1 || numQuestion <= 0) {
            System.out.println("Нет такого вопроса.");
        } else {
            for (int numQuestions = 0; numQuestions < questionsTestingAndVersion.length; numQuestions++) {
                if (numQuestion == numQuestions + 1) {
                    for (int numAnswers = 0; numAnswers < questionsTestingAndVersion[numQuestions].length; numAnswers++) {
                        System.out.println(questionsTestingAndVersion[numQuestions][numAnswers]);
                    }
                }
            }
        }
    }
}

package Home_4_OOP;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Questions questions = new Questions();
        Answer answer = new Answer();

        for (int numTesting = 1; numTesting <= questions.getCountQuestions(); numTesting++) {
            questions.printQuestionAndVersion(numTesting);
            String userAnswer = scan.next();
            userAnswer = questions.validAnswerVersion(numTesting, userAnswer, scan);
            boolean rezult = answer.getAnswer(numTesting, userAnswer);
            answer.printRezult(rezult);
            answer.countVal(rezult);
        }
        answer.printRezult();
    }
}

import java.util.Scanner;

public class HomeWork3 {
    static Scanner scan = new Scanner(System.in);

    private static int evaluationResponse;
    private static final int BAL = 5;
    private static String[] versionAnswer = {
            "\n A: 31 \n B: 28 \n C: 30 \n D: 29 \n",
            "\n A: 25 \n B: 31 \n C: 29 \n D: 30 \n",
            "\n A: 31 \n B: 29 \n C: 30 \n D: 28 \n"
    };

    private static String[] questionsTesting = {
            "Сколько дней в ноябре ?",
            "Сколько дней в декабре ?",
            "Сколько дней в январе ?"
    };

    public static String validAnswer(String answer) {
        if (    "A".equals(answer) ||
                "B".equals(answer) ||
                "C".equals(answer) ||
                "D".equals(answer)
        ) {
            return answer;
        } else {
            System.out.println("Такого варианта нет, выберите из перечисленных.");
            answer = scan.next();
            return validAnswer(answer);
        }
    }

    public static int countVal(int numQuestion, String answer) {
        numQuestion++;
        if (    (numQuestion == 1 && answer.equals("C")) ||
                (numQuestion == 2 && answer.equals("B")) ||
                (numQuestion == 3 && answer.equals("A"))
        ) {
            return BAL;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {

        for (int i = 0; i < questionsTesting.length; i++) {
            System.out.println(questionsTesting[i]);
            System.out.println(versionAnswer[i]);
            String rezult = scan.next();
            rezult = validAnswer(rezult);
            evaluationResponse += countVal(i, rezult);
        }
        System.out.println("Опрос окончен, верных ответов: " + evaluationResponse / BAL + "\nОценка: " + evaluationResponse);

    }


}



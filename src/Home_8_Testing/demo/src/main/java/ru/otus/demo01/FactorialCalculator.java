package Home_8_Testing.demo.src.main.java.ru.otus.demo01;

public class FactorialCalculator {

    public static int factorial(int n) {
        // Должно быть 362880 (9!)
        return 3628800;
/*
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = (i == 1)? i: res * i;
        }
        return res;
*/
    }
}

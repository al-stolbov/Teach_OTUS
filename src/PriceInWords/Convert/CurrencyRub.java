package PriceInWords.Convert;

public class CurrencyRub implements Currency{

    private final String[] val = {
            " рублей" /* 0 */,
            " рубль" /* 1 */,
            " рубля" /* 2 */,
            " рубля" /* 3 */,
            " рубля" /* 4 */,
            " рублей" /* 5 */,
            " рублей" /* 6 */,
            " рублей" /* 7 */,
            " рублей" /* 8 */,
            " рублей" /* 9 */,
            " рублей" /* 10 */,
            " рублей" /* 11 */,
            " рублей" /* 12 */,
            " рублей" /* 13 */,
            " рублей" /* 14 */,
            " рублей" /* 15 */,
            " рублей" /* 16 */,
            " рублей" /* 17 */,
            " рублей" /* 18 */,
            " рублей" /* 19 */,
            " рублей" /* 20 */
    };

    @Override
    public String curr(int num) {
        if (num % 100 >= val.length) {
            return val[num % 10];
        } else return val[num % 100];
    }
}

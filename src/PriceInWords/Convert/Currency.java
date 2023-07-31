package PriceInWords.Convert;

public enum Currency {
    RUB,
    UNKNOWN;

    private final String[] rub = {
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

    private String[] val(Currency currency) {
        switch (currency) {
            case RUB:
                return rub;
            default:
                return new String[]{};
        }
    }

    public String curr(int num) {
        var val = val(Currency.this);

        if (val.length > 0) {
            if (num % 100 >= val.length) {
                return val[num % 10];
            } else return val[num % 100];
        } else {
            return " без валюты";
        }
    }
}

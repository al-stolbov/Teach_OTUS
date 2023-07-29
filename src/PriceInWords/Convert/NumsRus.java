package PriceInWords.Convert;

public class NumsRus implements Nums {

    private final String[] units = {
            "", "один", "два", "три", "четыре", "пять", "шесть", "семь",
            "восемь", "девять", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
            "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"
    };

    private final String[] tens = {
            "",
            "",
            "двадцать",
            "тридцать",
            "сорок",
            "пятьдесят",
            "шестьдесят",
            "семьдесят",
            "восемьдесят",
            "девяносто"
    };

    private final String[] hundreds = {
            "",
            "сто",
            "двести",
            "триста",
            "четыреста",
            "пятьсот",
            "шестьсот",
            "семьсот",
            "восемьсот",
            "девятьсот"
    };

    private final String[] thousand = {
            "",
            "одна тысяча",
            "две тысячи",
            "три тысячи",
            "четыре тысячи",
            "пять тысяч",
            "шесть тысяч",
            "семь тысяч",
            "восемь тысяч",
            "девять тысяч"
    };

    @Override
    public String convert(int num, boolean recursion) {

        if (num == 0 && !recursion) {
            return "ноль";
        }

        if (num < 20) {
            return units[num];
        }

        if (num < 100) {
            return tens[num / 10] + ((num % 10 != 0) ? " " : "") + units[num % 10];
        }

        if (num < 1000) {
            return hundreds[num / 100] + ((num % 100 != 0) ? " " : "") + convert(num % 100, true);
        }

        if (num < 10_000) {
            return thousand[num / 1000] + ((num % 1000 != 0) ? " " : "") + convert(num % 1000, true);
        }

        if (num < 100_000) {
            return ((num / 1000 < 20) ? units[num / 1000] + " тысяч " : tens[num / 10000] + ((num % 10_000 >= 1000) ? " " : " тысяч "))
                    + convert((num / 1000 < 20) ? num % 1000 : num % 10_000, true);
        }

        if (num < 1_000_000) {
            return hundreds[num / 100_000] + ((num % 100_000 >= 1000) ? " " : " тысяч ") + convert(num % 100_000, true);
        }

        if (num < 2_000_000) {
            return convert(num / 1_000_000, true) + " миллион" + ((num % 1_000_000 != 0) ? " " : "") + convert(num % 1_000_000, true);
        }

        if (num == 2_000_000) {
            return "два миллиона";
        }
        return "Много";
    }
}

package PriceInWords.Consumer;

public class PrintImp implements Print{
    @Override
    public String printOut(String mess) {
        String str = mess.substring(0, 1).toUpperCase() + mess.substring(1) + ".";
        System.out.println(str);
        return str;
    }
}

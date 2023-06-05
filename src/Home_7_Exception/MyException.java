package Home_7_Exception;

public class MyException extends RuntimeException {

    public MyException(String message) {
        super(message);
    }

    public MyException() {
        super("Oops!");
    }
}

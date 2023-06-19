package Home_8_Testing.demo.src.main.java.ru.otus.demo03.app.service;

public interface IOService {
    void outputString(String message);
    void outputString(String template, Object ...args);
    String inputString();
}

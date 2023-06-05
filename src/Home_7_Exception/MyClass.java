package Home_7_Exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyClass {

    public static void main(String[] args) throws BusinessError {
        try {
            throw new MyException("Вывод ошибки. ");
        } catch (MyException ex) {
            System.out.println("В процессе выполнения произошла непредвиденная ситуация. " + ex.getMessage());
            ex.printStackTrace();
        }


        try (FileOutputStream file = new FileOutputStream("Путь к файлу")) {
            file.write(3);

        } catch (IOException ex) {
            throw new RuntimeException("Проверьте путь к файлу.", ex);
        }


        try {
            throw new Exception("Rethrow");
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new BusinessError("Пробрасываем ошибку дальше.");
        }
    }
}

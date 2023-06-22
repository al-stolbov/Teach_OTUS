package Home_7_Exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class MyClass {

    public static void main(String[] args) throws BusinessError, IOException {
        try {
            throw new MyException("Вывод ошибки. ");
        } catch (MyException ex) {
            System.out.println("В процессе выполнения произошла непредвиденная ситуация. " + ex.getMessage());
            ex.printStackTrace();
        }


        try (FileOutputStream file = new FileOutputStream("Путь к файлу")) {
            file.write(3);
        }


        try {
            throw new Exception("Rethrow");
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new BusinessError("Пробрасываем ошибку дальше.");
        }
    }
}

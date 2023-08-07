import java.util.Scanner;
import java.util.regex.Pattern;

public class DZ3_1 {
    public static void main(String[] args) throws IncorrectPassword {
        Scanner iScanner = new Scanner(System.in, "ibm866");
        System.out.println("Введите пароль: ");
        String password = iScanner.nextLine();

        try {
            if (password.length() < 8) {
                throw new IncorrectPassword("Пароль должен быть не менее 8 символов.");
            }
            if (!Pattern.matches("(.*[0-9]+.*)", password)) {
                throw new IncorrectPassword("Пароль должен содержать хотя бы одну цифру.");
            }
            if (!Pattern.matches("(.*[A-Z]+.*)", password)) {
                throw new IncorrectPassword("Пароль должен содержать хотя бы одну заглавную букву.");
            }
            System.out.println("Пароль введен успешно");

        } catch (IncorrectPassword e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        iScanner.close();

    }
}

class IncorrectPassword extends Exception {
    public IncorrectPassword(String message) {
        super(message);
    }
}
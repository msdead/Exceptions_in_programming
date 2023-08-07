import java.util.Scanner;

public class DZ2_2 {
    public static void main(String[] args) throws DivisionByZeroException {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        double a = iScanner.nextInt();
        System.out.println("Введите число b: ");
        double b = iScanner.nextInt();

        try {
            double result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль недопустимо");
        }
        iScanner.close();
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

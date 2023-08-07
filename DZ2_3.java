import java.util.Scanner;

public class DZ2_3 {
    public static void main(String[] args)
            throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException {

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        double a = iScanner.nextInt();
        System.out.println("Введите число b: ");
        double b = iScanner.nextInt();
        System.out.println("Введите число c: ");
        double c = iScanner.nextInt();

        try {
            if (a > 100) {
                throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
            }
            if (b < 0) {
                throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
            }
            if (a + b < 10) {
                throw new NumberSumException("Сумма первого и второго чисел слишком мала");
            }
            if (c == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            }
            System.out.println("Проверка пройдена успешно");
        } catch (NumberOutOfRangeException | NumberSumException | DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}

class NumberSumException extends Exception {
    public NumberSumException(String message) {
        super(message);
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

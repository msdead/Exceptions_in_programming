import java.util.Scanner;

public class DZ2_2 {
    public static void main(String[] args) throws DivisionByZeroException {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        double a = iScanner.nextInt();
        System.out.println("Введите число b: ");
        double b = iScanner.nextInt();

        if (a !=0 && b != 0) {
            System.out.println(a/b);
        } else {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        iScanner.close();
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

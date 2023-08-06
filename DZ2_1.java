import java.util.Scanner;

public class DZ2_1 {
    public static void main(String[] args) throws InvalidNumberException{
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = iScanner.nextInt();
        if (n > 0) {
            System.out.println("Число корректно");
        } else {
            throw new InvalidNumberException( "Некорректное число");
        }
        iScanner.close();
    }
}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}
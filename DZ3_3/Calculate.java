package DZ3_3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate {

    public Calculate() {
        MathOperation math = new MathOperation();
        Scanner iScanner = new Scanner(System.in);
        try {
            System.out.println("Введите первое число: ");
            double x = iScanner.nextDouble();
            math.add(x);
            System.out.println("Введите знак ( + | - | / | * | ^ ): ");
            char operator = iScanner.next().charAt(0);
            if (operator != '+' && operator != '-' && operator != '/' && operator != '*' && operator != '^') {
                throw new InvalidValueEntered("Введен неверный знак");
            }
            math.add(operator);
            System.out.println("Введите второе число: ");
            double y = iScanner.nextDouble();
            math.add(y);
            double result = 0;
            switch (operator) {
                case '+':
                    math.result(result = math.plus(x, y));
                    break;
                case '-':
                    math.result(result = math.minus(x, y));
                    break;
                case '/':
                    math.result(result = math.divide(x, y));
                    break;
                case '*':
                    math.result(result = math.multiply(x, y));
                    break;
                case '^':
                    math.result(result = math.exponenta(x, y));
                    break;
                default:
                    throw new IllegalArgumentException("Недопустимая операция");
            }
            math.add('=');
            math.add(result);

            while (operator != '0') {
                System.out
                        .println(
                                "Для продолжения вычеслений нажмите 1 \nДля вывода предыдущих вычеслений нажмите 2 \nДля завершения нажмите любую другую кнопку  ");
                operator = iScanner.next().charAt(0);
                if (operator == '1') {
                    result = math.NextCalc(result);
                    math.add('=');
                    math.add(result);
                } else if (operator == '2') {
                    math.look();
                } else {
                    operator = '0';
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Некорректный ввод");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        iScanner.close();
    }
}

class InvalidValueEntered extends Exception {
    public InvalidValueEntered(String message) {
        super(message);
    }
}
package DZ3_3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MathOperation {
    ArrayList list = new ArrayList<>();

    public double plus(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws ArithmeticException {
        if (a == 0 || b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо.");
        }
        return a / b;
    }

    public double exponenta(double a, double b) {
        return (double) Math.pow(a, b);
    }

    public void result(double result) {
        System.out.println("Ответ: " + result);
    }

    public double NextCalc(double x) {
        MathOperation math = new MathOperation();

        Scanner iScanner = new Scanner(System.in);
        double result = 0;

        try {
            System.out.println("Введите знак ( + | - | / | * | ^ ): ");
            char operator = iScanner.next().charAt(0);
            if (operator != '+' && operator != '-' && operator != '/' && operator != '*' && operator != '^') {
                throw new InvalidValueEntered("Введен неверный знак");
            }
            list.add(operator);
            System.out.println("Введите число: ");
            double y = iScanner.nextDouble();
            list.add(y);
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
        } catch (InputMismatchException e) {
            System.out.println("Некорректный ввод");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        return result;
    }

    public void add(double number) {
        list.add(Double.toString(number));
    }

    public void add(char number) {
        list.add(String.valueOf(number));
    }

    public void look() {
        System.out.println(list);
    }
}

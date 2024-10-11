import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите первое число");
        double num1 = scanner.nextDouble();

        System.out.println("Выберите второе число");
        double num2 = scanner.nextDouble();

        System.out.println("Выберите операцию: +, -, *, /");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                }else {
                    System.out.println("Ошибка: деление на ноль.");
                    return;
                }
                break;
            default:
                System.out.println("Неверная операция");
                return;
        }
        System.out.printf("Результат: %.2f\n", result);
    }
}
import java.util.Scanner;

public class TwoDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваши числа: ");

        Calculator calculator = new Calculator();

        Double YourNumber1 = scanner.nextDouble();
        Double YourNumber2 = scanner.nextDouble();

        double result1 = calculator.sum(YourNumber1,YourNumber2);
        double result2 = calculator.sub(YourNumber1,YourNumber2);
        double result3 = calculator.div(YourNumber1,YourNumber2);
        double result4 = calculator.multiply(YourNumber1,YourNumber2);

        System.out.println("Результат сложения двух чисел : " + result1);
        System.out.println("Результат вычитания двух чисел : " + result2);
        System.out.println("Результат деления двух чисел : " + result3);
        System.out.println("Результат умножения двух чисел : " + result4);
    }
}

import java.util.Scanner;

public class ThreeDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 целых числа: ");

        Calculator calculator = new Calculator();

        Double YourNumber1 = scanner.nextDouble();
        Double YourNumber2 = scanner.nextDouble();
        Double YourNumber3 = scanner.nextDouble();

        double result = calculator.average(YourNumber1,YourNumber2,YourNumber3);

        System.out.println("Среденее арифмитическое ваших чисел : " + result);

    }
}


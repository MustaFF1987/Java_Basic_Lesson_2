import java.util.Scanner;

public class CircleParameters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус круга: ");

        Calculator calculator = new Calculator();

        Double YourNumber = scanner.nextDouble();

        double result1 = calculator.CirclePerimetr(YourNumber);
        double result2 = calculator.CircleArea(YourNumber);

        System.out.println("Периметр круга равен: " + result1);
        System.out.println("Площадь круга равна: " + result2);


        System.out.println("Спасибо за внимание! ");

    }
}


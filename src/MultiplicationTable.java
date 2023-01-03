import java.util.Random;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");

        Calculator calculator = new Calculator();

        Integer YourNumber = scanner.nextInt();

        Integer number1 = 1;
        Integer number2 = 2;
        Integer number3 = 3;
        Integer number4 = 4;
        Integer number5 = 5;
        Integer number6 = 6;
        Integer number7 = 7;
        Integer number8 = 8;
        Integer number9 = 9;
        Integer number10 = 10;

        int result1 = calculator.mult(YourNumber,number1);
        int result2 = calculator.mult(YourNumber,number2);
        int result3 = calculator.mult(YourNumber,number3);
        int result4 = calculator.mult(YourNumber,number4);
        int result5 = calculator.mult(YourNumber,number5);
        int result6 = calculator.mult(YourNumber,number6);
        int result7 = calculator.mult(YourNumber,number7);
        int result8 = calculator.mult(YourNumber,number8);
        int result9 = calculator.mult(YourNumber,number9);
        int result10 = calculator.mult(YourNumber,number10);

        System.out.println("Результат: ");
        System.out.println("1 x " + YourNumber + " = " + result1);
        System.out.println("2 x " + YourNumber + " = " + result2);
        System.out.println("3 x " + YourNumber + " = " + result3);
        System.out.println("4 x " + YourNumber + " = " + result4);
        System.out.println("5 x " + YourNumber + " = " + result5);
        System.out.println("6 x " + YourNumber + " = " + result6);
        System.out.println("7 x " + YourNumber + " = " + result7);
        System.out.println("8 x " + YourNumber + " = " + result8);
        System.out.println("9 x " + YourNumber + " = " + result9);
        System.out.println("10 x " + YourNumber + " = " + result10);
        System.out.println("Спасибо за внимание! ");

    }
}

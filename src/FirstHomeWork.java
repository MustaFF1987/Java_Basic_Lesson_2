import java.sql.SQLOutput;

public class FirstHomeWork {

    public static void main(String[] args) {

        Integer TotalSum = 500;
        Integer A = 250;
        Integer B = 200;
        Integer C = 50;

        Integer result1 = TotalSum - A - C;
        Integer result2 = TotalSum - A - B;
        Integer result3 = TotalSum - B - C;

        System.out.println("У нас есть трёхзначное число: " + TotalSum);
        System.out.println("Число А: " + result3 + ";");
        System.out.println("Число B: " + result1 + ";");
        System.out.println("Число C: " + result2 + ";");

    }
}

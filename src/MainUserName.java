import java.util.Scanner;

public class MainUserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");

        String name = scanner.nextLine();
        System.out.println(new StringBuilder().append("Hello ").append(name).append(" !").toString());
    }
}

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("Enter First Number");
            int num = scanner.nextInt();
            System.out.println("Enter Second Number");
            int num2 = scanner.nextInt();
            System.out.println("Select Operation:");
            char operation = scanner.next().charAt(0);
            switch (operation) {
                case '+':
                    System.out.println(num + num2);
                    break;
                case '-':
                    System.out.println(num - num2);
                    break;
                case '*':
                    System.out.println(num * num2);
                    break;
                case '/':
                    System.out.println(num / num2);
                    break;

            }
        }
    }
}

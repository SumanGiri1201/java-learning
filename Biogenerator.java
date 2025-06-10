import java.util.Scanner;
public class Biogenerator {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your hobby: ");
        String hobby = scanner.nextLine();
        System.out.println("Generate Bio: " + name + " is " + age + " years old " + " and she loves " + hobby);
        scanner.close();
    }
}

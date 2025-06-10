import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //before swapping
        System.out.println("Enter first number ");
        int num = sc.nextInt();
        System.out.println("Second number= ");
        int num1=sc.nextInt();
//swapping number with third variable
        int num2;
        System.out.println("After Swappin: first number= ");
        num2=num1;
        System.out.println(num2);
        System.out.println("After Swappin: Second number= ");
        num2=num;
        System.out.println(num2);

        sc.close();
    }

}

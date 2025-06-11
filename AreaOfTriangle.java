import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of triangle");
        double length=sc.nextDouble();
        System.out.println("Enter breadth of triangle");
        double breadth=sc.nextDouble();
        System.out.println("Enter height of triangle");
        double height=sc.nextFloat();

        int AreaOfTriangle;
        AreaOfTriangle=(int)(length*breadth*height);
        System.out.println("Area of Triangle="+AreaOfTriangle);

        int Perimeter;
        Perimeter= (int)(length+breadth+height);
        System.out.println("Perimeter of Triangle= " +Perimeter);

        sc.close();

    }
}

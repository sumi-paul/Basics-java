package calculator;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius of a circle");
        double radius=input.nextDouble();
        double area=radius*radius*3.1416;
        System.out.println("Area"+area);
        /*System.out.println("Enter a number");
        int a=input.nextInt();
        System.out.print("Enter Another Number");
        int b=input.nextInt();
        int sum=a+b;
        System.out.println("Sum :"+sum);*/
       
    }
}

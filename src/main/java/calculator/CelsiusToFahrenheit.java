package calculator;
import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter temperature in celsius: ");
        double celsius =input.nextDouble();
        double farenheit=(celsius *9/5)+32;
        System.out.println("Temperature in fahernheit: "+farenheit);
    }
}

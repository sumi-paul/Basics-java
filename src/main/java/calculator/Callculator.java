package calculator;
import java.util.Scanner;
public class Callculator {
    public static void main(String args[]) {
        Scanner input= new Scanner(System.in);
        System.out.println("Choose an operator: +, -, *, or / : ");
        char operator =input.next().charAt(0);
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter Second number: ");
        int number2 = input.nextInt();
        int result = switch (operator){
            case '+' -> number1+number2;
            case '-' -> number1-number2;
            case '*' -> number1*number2;
            case '/' -> number1/ number2;
            default -> {
                System.out.println("Invalid operartor");
                yield 0;
            }
        };
        System.out.println("Result: "+result);
    }
}

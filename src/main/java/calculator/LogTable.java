package calculator;
import java.util.Scanner;
public class LogTable {
    public static void main(String args[]) {
       Scanner input= new Scanner(System.in);
        System.out.println("Enter the number");
       int number =input.nextInt();
       int i=1;
        System.out.println("n \tlog10(n) \tlog2(n) \tloge(n)");
        System.out.println("---------------------------------");
        while(i<=number){
            double log10 = Math.log10(i);
            double log2= Math.log(i)/Math.log(2);
            double loge = Math.log(i);
            String row =String.format("%d"+ "\t%.6f\t%.6f" + "\t%.6f", i, log10,log2,loge);
            System.out.println(row);
            i++;
        }
    }
}

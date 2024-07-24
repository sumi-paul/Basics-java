package calculator;
public class OverflowUnderflow {
    public static void main(String args[]) {
        int a=2147483647;
        a=a+1;
        System.out.println(a);
        int b= -2147483648;
        b=b-1;
        System.out.println(b);
    }
}

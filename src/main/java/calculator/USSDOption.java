package calculator;
import java.util.Scanner;
public class USSDOption {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.println("""
                           0.Download MyGP;
                           1.Balance,Call Rate & FnF
                           2.GP STAR
                           3.INTERNET Pack
                           4.Talk Time/ Minutes Pack
                           5.My Offers
                           6.Welcome tune
                           """);
        System.out.println("Select an Option from (0 to 6): ");
        int number = input.nextInt();
        if (number==0){
            System.out.println("Downloading MyGp");
        }else if(number==1){
            System.out.println("You don't have sufficient balance, " + "recharge now");
        }else if(number==2){
            System.out.println("Your sounding privileged");
        }else if(number==3){
            System.out.println("1 GB at TK 38");
            System.out.println("5 GB at Tk 299");
        }else if(number==4){
            System.out.println("You have 100 minutes free talktime, " + "use them");
        }else if(number==5){
            System.out.println("You don't have any offer," + "migrate to another provider!");
        }else if(number==6){
            System.out.println("We are out of service at this moment");
        }else{
            System.out.println("You pressed wrong code");
        }
    }
}

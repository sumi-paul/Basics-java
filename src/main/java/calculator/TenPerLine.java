package calculator;
public class TenPerLine {
    public static void main(String args[]) {
     int Start =0;
     int end =500;
     int per_line =10;
     int counter = Start;
     while(counter <=end){
         System.out.println(counter + " ");
         if((counter+1)%per_line==0){
             System.out.println();
         } 
         counter++;
     }
     
    }
}

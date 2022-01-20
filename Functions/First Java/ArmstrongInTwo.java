//To find Armstrong Number between two given number.
import java.util.*;
public class ArmstrongInTwo{
  public static void main (String[]args){
    
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    
    
    armstrong(n1 , n2);
  }
  
  static void armstrong(int num1 , int num2){
     for (int i = num1; i<num2; i++){
         int check, sum = 0 ,rem;
         check = i;
         while(check != 0) {
            rem = check % 10;
            sum = sum + (rem * rem * rem);
            check = check / 10;
         }
         if(sum == i){
            System.out.println(""+i+" is an Armstrong number.");
         }
      }
   }
}

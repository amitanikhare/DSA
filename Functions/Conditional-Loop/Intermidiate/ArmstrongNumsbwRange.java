//Armstrong Number In Java
import java.util.*;
public class ArmstrongNumsbwRange{
  public static void main (String[]args){
      Scanner in = new Scanner(System.in);
      System.out.println("Enter range in b/w you want to display armstrong number:- ");
      int n1 = in.nextInt();
      System.out.println("To :-");
      int n2 = in.nextInt();
    
    arm(n1 , n2);
  }
  static void arm(int num1 , int num2){
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

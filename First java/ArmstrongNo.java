//To find Armstrong Number between two given number.
public class ArmstrongNo{
  public static void main (String[]args){
    int num1 = 1;
    int num2 = 500;
    
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

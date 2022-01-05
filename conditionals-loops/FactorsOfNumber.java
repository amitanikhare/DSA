//Input a number and print all the factors of that number (use loops).
import java.util.*;
class FactorsOfNumber {
    public static void main(String[] args) {
        int i,num;
         Scanner in = new Scanner(System.in);
         System.out.println("Enter number :- ");
         num = in.nextInt();
         System.out.print("Factor is :- ");
         for(i = 1 ; i<= num ; i++){
             if(num%i == 0){
         System.out.print(i+" ");
             }
         }
    }
}

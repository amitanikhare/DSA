//Input a number and print all the factors of that number (use loops)...
import java.util.*;
public class FactorsOfNum{
	public static void main(String[] args) {
        int num;
         Scanner in = new Scanner(System.in);
         System.out.println("Enter number :- ");
         num = in.nextInt();
         
         factors(num);
         
    }
    static void factors(int n){
        System.out.print("Factor is :- ");
         for(int i = 1 ; i<= n ; i++){
             if(n%i == 0){
         System.out.print(i+" ");
             }
         }
    }
}

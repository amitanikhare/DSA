//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.*;
public class Main{
	public static void main(String[] args) {
	    
        int num = 0;
        sum(num);
         
    }
    static void sum(int n){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number :- ");
        int sum = 0;
        while (true){
	    n = in.nextInt();
	    sum += n;
	      if (n == 0){
	       System.out.println ("sum = " + sum);
	      break;
	      }
            
        }
        
    }
}

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.*;
public class SumTillZero{
 public static void main (String[]args){
    int n, sum = 0;
    Scanner in = new Scanner (System.in);
    while (true){
	    n = in.nextInt ();
	    sum += n;
	  if (n == 0){
	    System.out.println ("sum = " + sum);
	    break;
	  }
   }
  }
}

//LCM Of Two Numbers
import java.util.*;
public class LcmOfTwoNums{
  public static void main (String[]args){
    Scanner in = new Scanner (System.in);
    System.out.println ("Enter first number :- ");
    int n1 = in.nextInt ();
    System.out.println ("Enter second number :- ");
    int n2 = in.nextInt ();
    lcmOfNum(n1 , n2);
  }
  static void lcmOfNum(int num1 , int num2){
    int lcm;
      lcm = (num1 > num2) ? num1 : num2;
    while (true){
	if (lcm % num1 == 0 && lcm % num2 == 0)
	  {
	    System.out.println ("Lcm is: " + lcm);
	    break;
	  }
     	lcm++;
    }
  }
}

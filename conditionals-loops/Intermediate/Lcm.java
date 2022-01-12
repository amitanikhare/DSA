//LCM Of Two Numbers
import java.util.*;
public class Lcm{
  public static void main (String[]args){
    Scanner in = new Scanner (System.in);
    int num1 = in.nextInt ();
    int num2 = in.nextInt ();
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

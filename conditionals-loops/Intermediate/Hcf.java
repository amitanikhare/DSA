//HCF Of Two Numbers Program
import java.util.*;
public class Hcf{
public static void main (String[]args){
    Scanner in = new Scanner (System.in);
    int num1 = in.nextInt ();
    int num2 = in.nextInt ();
    int hcf=0;
    for (int i = 1; i <= num1 || i <= num2; i++){
	if (num1 % i == 0 && num2 % i == 0)
	  hcf = i;
    }
       System.out.println(hcf);
  }
}

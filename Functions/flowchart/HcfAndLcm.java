//Take 2 numbers as inputs and find their HCF and LCM.
import java.util.*;
public class HcfAndLcm{
  public static void main (String[]args){
      Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();

    
    lcmAndHcf (n1, n2);
  }
  static void lcmAndHcf (int num1, int num2){
    int hcf = 0 , lcm;
    for (int i = 1; i <= num1 || i <= num2; i++){
	if (num1 % i == 0 && num2 % i == 0){
	    hcf = i;
	  }
    }
    System.out.println ("HCF of given two numbers is ::" + hcf);

    lcm = (num1 * num2) / hcf;
    System.out.println ("LCM of given two numbers is ::" + lcm);
  }
}

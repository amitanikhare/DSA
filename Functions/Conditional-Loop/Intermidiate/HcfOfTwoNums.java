//HCF Of Two Numbers Program
import java.util.*;
public class HcfOfTwoNums{
public static void main (String[]args){
    Scanner in = new Scanner (System.in);
    System.out.println("Enter first number :- ");
    int n1 = in.nextInt (); 
    System.out.println("Enter second number :- ");
    int n2 = in.nextInt ();
    
    int ans = hcf(n1 , n2);
    System.out.println("hCF is :- "+ans);
}
    static int hcf(int num1 , int num2){
    int hcf=0;
    for (int i = 1; i <= num1 || i <= num2; i++){
	if (num1 % i == 0 && num2 % i == 0)
	  hcf = i;
    }
       return hcf;
  }
}

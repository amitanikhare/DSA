//Subtract the Product and Sum of Digits of an Integer
import java.util.*;
public class SubEqualSp{
  public static void main (String[]args){
      int a = 234 , rem,p=1 ,s=0;
      while(a>0){
		    rem =a%10;
		    p *=rem;
		    s+=rem;
		    a =a/10;
		}
      System.out.println("Product = "+p);
      System.out.println("sum = "+s);
      int sub = p-s;
      System.out.println("subtract = "+sub);
  }
}

//Define a method that returns the product of two numbers entered by user.
import java.util.*;
public class Product{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 System.out.print("Enetr 1st number: ");
		int n1 = in.nextInt();
		System.out.print("Enetr 2st number: ");
		int n2 = in.nextInt();
		int ans = sum(n1 , n2);
		System.out.print("sum = "+ans);
	}
	static int sum(int num1 , int num2){
	    return num1*num2;
	}
}

//Take two numbers and print the sum of both.
import java.util.*;
public class Sum{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int ans = sum(num1 , num2);
		System.out.println("sum : "+ans);
	}
	static int sum(int a , int b){
	    return a+b;
	}
}

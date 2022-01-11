//Find if a number is palindrome or not
import java.util.*;
public class PalindromeOrNot{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n = in.nextInt();
		int original =n ,rem =0, sum=0;
		while(n>0){
		    rem = n% 10;
		    sum = (sum*10)+rem;
		    n/=10;
		}   
		if(original == sum){
		    System.out.println("Given Number is Palindrome");
		}else{
		    System.out.println("No it's not try again!");
		} 
	}
}

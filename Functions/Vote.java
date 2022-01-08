//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.*;
public class Vote{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 System.out.print("Enetr your age: ");
		int n = in.nextInt();
		vote(n);
	}
	static void vote(int n){
	    if(n >= 18){
		    System.out.println("your eligible to vote");
		}else{
		    System.out.println("your not eligible to vote.");
		}
	}
}

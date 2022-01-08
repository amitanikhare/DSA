//Define a program to find out whether a given number is even or odd.
import java.util.*;
public class EvenOrOdd{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		eOr(n);
	}
	static void eOr(int n){
	    if(n % 2 == 0){
		    System.out.println("EVEN");
		}else{
		    System.out.println("ODD");
		}
	}
}

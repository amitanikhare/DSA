//Check Leap Year Or Not.
import java.util.*;
public class LeapOrNot{
	public static void main(String[] args) {
		System.out.println("Enter Year: ");
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		if(((year % 4 == 0)||(year % 100 == 0))||(year % 400 == 0)){
		    System.out.println("given year is Leap Year");
		}else{
		    System.out.println("given year is not Leap Year");
		}
	}
}

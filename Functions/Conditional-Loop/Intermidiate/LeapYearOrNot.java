//Check Leap Year Or Not.
import java.util.*;
public class LeapYearOrNot{
	public static void main(String[] args) {
		System.out.println("Enter Year: ");
		Scanner in = new Scanner(System.in);
		int y = in.nextInt();
		boolean ans = leapNot(y);
		System.out.println(ans);
	}
	static boolean leapNot(int year){
		if(((year % 4 == 0)||(year % 100 == 0))||(year % 400 == 0)){
		  return true;
		}else{
		  return false;
		}
	}
}

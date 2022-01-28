//Sum Of A Digits Of Number.
import java.util.*;
public class SumOfDigitsOfNumber{
	public static void main(String[] args) {
	    sumOfNums();
	}
	static void sumOfNums(){
		System.out.println("Enter digits: ");
		Scanner in = new Scanner(System.in);
		int rem =0 , sum =0 , original;
		int num = in.nextInt();
		original = num;
		while(num>0){
		    rem = num % 10;
		    sum += rem;
		    num/=10;
		}
		System.out.println("sum : "+sum);
	}
}

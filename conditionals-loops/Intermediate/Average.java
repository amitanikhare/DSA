//Calculate Average Of N Numbers.
import java.util.*;
public class Average
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n , sum=0 , c=1 , num;
		float avg;
		System.out.println("how many number you want to enter : ");
		num = in.nextInt();
		
		while(c <= num){
		    n = in.nextInt();
		    sum+=n;
		    c++;
		}
		avg = sum/num;
		System.out.print("avg: "+avg);
	}
}

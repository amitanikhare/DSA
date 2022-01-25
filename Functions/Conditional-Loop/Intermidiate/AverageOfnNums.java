//Calculate Average Of N Numbers...
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		System.out.println("how many number you want to enter : ");
		num = in.nextInt();
		
		avg(num);
		
	}
	static void avg(int number){
	    Scanner in = new Scanner(System.in);
	    int n , sum=0 , c=1 ;
	    float avg;
		while(c <= number){
		    n = in.nextInt();
		    sum+=n;
		    c++;
		}
		avg = sum/number;
		System.out.print("avg: "+avg);
	}
}

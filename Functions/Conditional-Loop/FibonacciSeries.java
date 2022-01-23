//Fibonacci Series In Java Programs
import java.util.*;
public class FibonacciSeries{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = in.nextInt();
        
        fibo(num);
	    
	}
	static void fibo(float n){
	    int a = 0;
        int b = 1;
        int count = 2;
        while(count <= n){
            int temp = b;
            b=b+a;
            a=temp;
            count++;
        System.out.println(b);
        }
    }
}

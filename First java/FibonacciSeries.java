//To calculate Fibonacci Series up to n numbers.
import java.util.*;
class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= num){
            int temp = b;
            b=b+a;
            a=temp;
            count++;
        System.out.println(b);
        }
    }
}

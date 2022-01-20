//Take 2 numbers as input and print the largest number.
import java.util.*;
class LargeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int n2 = sc.nextInt();
        
        int ans = largeNum(n1 , n2);
        System.out.println(ans+" is a largest number");
    }
    static int largeNum(int num1 , int num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
}

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1: "); 
        int num1 = sc.nextInt();
        System.out.println("enter number 2: ");
        int num2 = sc.nextInt();
        System.out.println("enter operator: "); 
        char ch = sc.next().trim().charAt(0);
        if(ch == '+')
        System.out.println(num1 + num2);
        if(ch == '-')
        System.out.println(num1 - num2);
        if(ch == '*')
        System.out.println(num1 * num2);
        if(ch == '/')
        System.out.println(num1 / num2);
    }
}

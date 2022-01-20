//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.*;
class Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1: "); 
        int n1 = sc.nextInt();
        System.out.println("enter number 2: ");
        int n2 = sc.nextInt();
        System.out.println("enter operator: "); 
        char char1 = sc.next().trim().charAt(0);
        
        operation(char1 , n1 , n2);
    }
    
    static void operation(char ch , int num1 , int num2){
        if(ch == '+')
        System.out.println("num1 + num2 : "+(num1 + num2));
        if(ch == '-')
        System.out.println("num1 - num2 : "+(num1 - num2));
        if(ch == '*')
        System.out.println("num1 * num2 : "+(num1 * num2));
        if(ch == '/')
        System.out.println("num1 / num2 : "+(num1 / num2));
    }
}

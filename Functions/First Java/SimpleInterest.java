//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Enter Principal, Time and Rate: "); 
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextFloat();
        double time = sc.nextFloat();
        double rate = sc.nextFloat();
        
        simpleInterest(principal, time, rate);  
    }
    
    static void simpleInterest(double p , double t , double r){
        double si = (p*t*r)/100;
        System.out.println("SI : "+si);
    }
}

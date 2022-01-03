//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.*;
class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("enter P , T , R: "); 
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat();
        float t = sc.nextFloat();
        float r = sc.nextFloat();
        float si = (p*t*r)/100;
        System.out.println("SI : "+si);
    }
}

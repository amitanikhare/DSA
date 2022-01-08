//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
import java.util.*;
public class CircumAndAreaOfCircle{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner in = new Scanner(System.in);
		float radius = in.nextFloat();
		circum(radius);
		area(radius);
	}
	static void circum(float r){
	    double c = 2*3.14*r;
	    System.out.println("Circumference of circle = "+c);
	}
	static void area(float r){
	    double a = 3.14*(r*r);
	    System.out.println("Area of circle = "+a);
	}
}

//Perimeter Of Parallelogram
import java.util.*;
public class PerimeterOfParallelogram{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base :- ");
        float base = sc.nextFloat();
        System.out.println("enter sides :- ");
        float sides = sc.nextFloat();
        
        double ans = area(base , sides);
        System.out.println("Perimeter Of Parallelogram :- "+ans);
	    
	}
	static double area(float b , float a){
        
        double peri = 2*(b+a);
        return peri;
    }
}

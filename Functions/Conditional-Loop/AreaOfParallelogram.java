//Area Of Parallelogram
import java.util.*;
public class AreaOfParallelogram{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base :- ");
        float base = sc.nextFloat();
        System.out.println("Enter height :-");
        float height = sc.nextFloat();
        
        double ans = area(base , height);
        System.out.println("Area Of Parallelogram :- "+ans);
	    
	}
	static double area(float b , float h){
	    
        double area = b * h;
        return area;
        
    }
}

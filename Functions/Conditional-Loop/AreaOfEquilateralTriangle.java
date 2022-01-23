//Area Of Equilateral Triangle
import java.util.*;
public class AreaOfEquilateralTriangle{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first diagonal's length :- ");
        float diagonal1 = sc.nextFloat();
        System.out.println("enter second diagonal's length :- ");
        float diagonal2 = sc.nextFloat();
        
        double ans = area(diagonal1 , diagonal2);
        System.out.println("Area Of Rhombus :- "+ans);
	    
	}
	static double area(float d1 , float d2){
        
        double area = (d1 * d2)/2;
        
        return area;
    }
}

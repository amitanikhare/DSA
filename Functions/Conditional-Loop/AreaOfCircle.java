//Area of circle
import java.util.*;
public class AreaOfCircle{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius :- ");
        float radius = sc.nextFloat();
        
        double ans = area(radius);
        System.out.println("Area Of Circle is :- "+ans);

	}
	static double area(float r){
        double area = 3.24*(r * r);
        return area;
        }
    }

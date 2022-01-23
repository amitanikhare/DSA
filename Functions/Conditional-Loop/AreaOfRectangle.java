//Area Of Rectangle Program
import java.util.*;
public class AreaOfRectangle{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width :- ");
        float width = sc.nextFloat();
        System.out.println("Enter height :- ");
        float height = sc.nextFloat();
        
        double ans = area(width , height);
        System.out.println("Area Of Rectangle is :- "+ans);
	    
	}
	static double area(float w , float h){
        double area = (w * h);
        
        return area;
        }
    }

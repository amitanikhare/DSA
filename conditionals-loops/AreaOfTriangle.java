//Area Of Triangle
import java.util.*;
class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base :- ");
        float base = sc.nextFloat();
        System.out.println("Enter height :- ");
        float height = sc.nextFloat();
        double area = (base * height)/2;
        System.out.println("Area Of Triangle is :- "+area);
        }
    }

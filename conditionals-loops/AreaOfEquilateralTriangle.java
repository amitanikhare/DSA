import java.util.*;
class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sides of triangle :- ");
        float a = sc.nextFloat();
        double area = (1.73 *(a*a))/4;
        System.out.println("Area Of Equilateral Triangle :- "+area);
    }
}

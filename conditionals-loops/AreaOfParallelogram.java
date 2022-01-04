//Area Of Parallelogram
import java.util.*;
class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base :- ");
        float base = sc.nextFloat();
        System.out.println("Enter height :-");
        float height = sc.nextFloat();
        double area = base * height;
        System.out.println("Area Of Parallelogram :- "+area);
    }
}

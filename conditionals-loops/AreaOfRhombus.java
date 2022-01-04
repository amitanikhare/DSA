//Area Of Rhombus
import java.util.*;
class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first diagonals :- ");
        float d1 = sc.nextFloat();
        System.out.println("enter second diagonals :- ");
        float d2 = sc.nextFloat();
        double area = (d1 * d2)/2;
        System.out.println("Area Of Rhombus :- "+area);
    }
}

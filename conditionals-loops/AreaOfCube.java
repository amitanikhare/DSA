//Total Surface Area Of Cube
import java.util.*;
class AreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length :- ");
        float a = in.nextFloat();
        double tsa = 6*(a*a);
        System.out.println("Total Surface Area Of Cube :- "+tsa);
    }
}

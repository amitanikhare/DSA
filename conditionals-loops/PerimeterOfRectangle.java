//Perimeter Of Rectangle
import java.util.*;
class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length :- ");
        float length = in.nextFloat();
        System.out.println("Enter width :- ");
        float width = in.nextFloat();
        double peri = 2*(length + width);
        System.out.println("Perimeter Of Rectangle :- "+peri);
    }
}

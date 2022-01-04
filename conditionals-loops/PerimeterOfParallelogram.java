//Perimeter Of Parallelogram
import java.util.*;
class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base :- ");
        int base = sc.nextInt();
        System.out.println("enter sides :- ");
        int a = sc.nextInt();
        float peri = 2*(base+a);
        System.out.println("Perimeter Of Parallelogram :- "+peri);
    }
}

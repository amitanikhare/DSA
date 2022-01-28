//Future Investment Value
import java.util.Scanner;
public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of principle: ");
        double p = in.nextDouble();
        System.out.println("Enter the value of rate: ");
        double r = in.nextDouble();
        System.out.println("Enter the value of time: ");
        double t = in.nextDouble();
        double ans = future(p , t , r);
        System.out.println("Future Interest is "+ans);
    }
    static double future(double principle , double rate , double time){

        /* Calculate Future investment Value*/
        double FI = principle *
                (Math.pow((1 + rate / 100), time));

        return FI;


    }
}

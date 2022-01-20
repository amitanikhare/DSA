//Input currency in rupees and output in USD.
import java.util.*;
class RupeesToUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rupees : ");
        double rupees = sc.nextFloat();
        
        double ans = usd(rupees);
         System.out.println("Rupees : "+ans);
    }
    
    static double usd(double r){
        double dollar = r/74;
        return dollar;
    }
}

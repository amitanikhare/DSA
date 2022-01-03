//Input currency in rupees and output in USD.
import java.util.*;
class RupeesToUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rupees : ");
        float rupees = sc.nextFloat();
        float dollar = rupees/64;
        System.out.println("Rupees : "+dollar);
    }
}

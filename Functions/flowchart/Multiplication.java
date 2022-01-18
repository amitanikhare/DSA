//Take a number as input and print the multiplication table for it.

import java.util.*;
public class Multiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        multi(n);
    }
        static void multi(int num){
        System.out.println("Enter number: "); 
        int table;
        for(int i = 1 ; i <= 10 ; i++){
            table = num * i;
            System.out.println(num +""+"*"+""+ i+" = "+table);
        }
    }
}

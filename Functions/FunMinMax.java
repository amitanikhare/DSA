//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt(),b = in.nextInt() , c=in.nextInt();
        largest(a,b,c);
        System.out.println();
        smallest(a,b,c);
    }
    static void largest(int n1 , int n2 , int n3){
        if(n1>n2 && n1>n3){
            System.out.println("Max : "+n1); 
        }else if(n2>n3){
            System.out.println("Max : "+n2); 
        }else{
            System.out.println("Max :"+n3); 
        }
    }
        static void smallest(int n1 , int n2 , int n3){
        if(n1<n2 && n1<n3){
            System.out.println("Min :"+n1); 
        }else if(n2<n3){
            System.out.println("Min :"+n2); 
        }else{
            System.out.println("Min :"+n3); 
        }
     }
}

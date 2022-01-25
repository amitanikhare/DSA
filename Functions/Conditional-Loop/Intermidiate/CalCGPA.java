//Calculate CGPA Java Program
import java.util.*;
public class CalCGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;  
        double[] mark =new double[n];
        System.out.println("Enter number of 1 subject: ");
        mark[0] = in.nextDouble();
        System.out.println("Enter number of 2 subject: ");
        mark[1] = in.nextDouble();
        System.out.println("Enter number of 3 subject: ");
        mark[2] = in.nextDouble();
        System.out.println("Enter number of 4 subject: ");
        mark[3] = in.nextDouble();
        System.out.println("Enter number of 5 subject: ");
        mark[4] = in.nextDouble();
        
        cgpa(mark , n);
        
    }
    static void cgpa(double marks[] , int n){
    
        double[] g = new double[n];
        double cgpa,sum=0;
        for(int i=0;i<n;i++)
        {
            g[i]=(marks[i]/10);
        }

        for(int i=0;i<n;i++)
        {
            sum+=g[i];
        }

        cgpa=sum/n;

        System.out.println("cgpa="+cgpa);
        System.out.println("percantage from cgpa="+cgpa*9.5);

    }
}

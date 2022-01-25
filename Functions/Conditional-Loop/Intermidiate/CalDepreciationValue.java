//Calculate Depreciation of Value
import java.util.*;
public class CalDepreciationValue{
	public static void main(String[] args) {
		long a,d,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount");
        a=sc.nextLong();
        System.out.println("enter Depreciation percentage");
        d=sc.nextLong();
        System.out.println("enter  number of years");
        y=sc.nextLong();;
		
		depreciation(a ,d , y);
	}
	static void depreciation(long  amount , long deppercent , long year){
        long temp=amount;
        for(int i=0;i<year;i++)
        temp=((100-deppercent)*temp)/100;
        System.out.println("after depreciation = "+temp);
    }
}

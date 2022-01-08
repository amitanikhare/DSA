//find armstrong no. whether its yes or not.
public class Armstrong{
	public static void main(String[] args) {
		int a = 153;
		int temp =a;
		int sum =0;
		int cube;
		int rem;
		while(a>0){
		    rem =a%10;
		    cube =(rem*rem*rem);
		    sum+=cube;
		    a =a/10;
		}
		System.out.println("sum = "+sum);
		if(sum == a){
		   System.out.println("yes"); 
		}else{
		    System.out.println("no");
		}
	}
}

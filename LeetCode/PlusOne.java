package leetcode;

//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].


public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1 ,2,3};
		int count = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			count++;
		}
		System.out.println(count);
		
		for(int i = 0 ; i < arr.length ; i++) {
		if(arr.length == count) {
			arr[i]++;
		}
	
		System.out.println(arr);
		}
	}
	
	

}

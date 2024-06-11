package arrays;

public class MaxVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,756,798,3,7};
		System.out.println(MaxVal(arr));
		System.out.println(maxRange(arr , 1,2));
	}
	
	//Maximum value in range
	//work on edge cases here , like array being null
		static int maxRange(int[] arr , int start , int end) {
			
			if(end > start) {
				return -1;
			}
			if (arr == null) {
				return -1;
			}
			
			int max = arr[start];
			for(int i = 0 ; i<end ; i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			return max;
		}
		
		
	//imagine that array is not empty
	static int MaxVal(int[] arr) {
		
		if (arr.length == 0 ) {
			return -1;
		}
		
		int max = arr[0];
		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}

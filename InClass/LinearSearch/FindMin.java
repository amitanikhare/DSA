package Linear_Search;

public class FindMin {

	public static void main(String[] args) {
		
		int[] arr = {6,75,5,7,37,9};
		System.out.println(min(arr));

	}
	static int min(int[] arr) {
		
		int n = arr[0];
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] < n) {
				n = arr[i];				
			}
		}
		return n;
	}

}

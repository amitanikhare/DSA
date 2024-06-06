package Linear_Search;

public class SearchInRange {

	public static void main(String[] args) {
		 int[] arr = {5 , 65,67,654,2,3,6,7};
		 int target = 67;
		int s = 2 ;
		int e = 5;
		
		System.out.println(range(s, e, arr, target));
		

	}

	static int range(int s , int e , int arr [] ,int target) {
		
		if (arr.length == 0 ) {
			return -1;
		}
		for(int i = s ; i<= e ; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}

package Linear_Search;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] nums = {23 , 45,67,-43,43,4,2,-432};
		int target = -43;
		System.out.println("Given element :" +linearSearch(nums, target));
		System.out.println("Element at index :"+returnIndex(nums, target));

	}
	//search in the array: return the index if item found
	//otherwise if item not found return -1
	static int returnIndex(int[] arr , int target) {
		if(arr.length == 0) {
			return -1;
		}
		//run a for loop
		for(int i = 0 ; i< arr.length ; i++) {
			//check for element at every index if it is = target
			if(arr[i] == target) {
				return i;
			}
		}
		//hence, in the condition if target not found
		return -1;
	} 
	
	
	//search in the array: return the element if item found
	//otherwise if item not found return -1
	static int linearSearch(int[] arr , int target) {
		if(arr.length == 0) {
			return -1;
		}
		//run a for loop
		for(int i = 0 ; i< arr.length ; i++) {
			//check for element at every index if it is = target
			if(arr[i] == target) {
				return target;
			}
		}
		//hence, in the condition if target not found
		return -1;
	}
}

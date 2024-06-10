package arrays;

public class DuplicateEleInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,1};
		
		System.out.println(containsDuplicate(nums));
		
//		for(int i = 0; i < arr.length; i++) {  
//	        for(int j = i+1 ; j < arr.length; j++) {  
//	            if(arr[i] == arr[j])  
//	                System.out.println(arr[j]);  
//	        }
//		
//		
//	        }
	}
	
	public static boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++) {  
	        for(int j = i+1 ; j < nums.length; j++) {  
	            if(nums[i] == nums[j]) { 
	                return true; 
                    }else {
                    return false;
                    }
                }
                }
                return true;
        }
    }




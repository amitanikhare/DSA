package arrays;

public class DuplicateEleInArray {

	public static void main(String[] args) {
		
		int[] arr = {334,55,21,7,1,7};
		
		
		for(int i = 0; i < arr.length; i++) {  
	        for(int j = i+1 ; j < arr.length; j++) {  
	            if(arr[i] == arr[j])  
	                System.out.println(arr[j]);  
	        }
	    }
	}
}

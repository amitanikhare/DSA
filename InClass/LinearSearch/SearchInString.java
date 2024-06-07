package Linear_Search;

import java.util.Arrays;

public class SearchInString {

	public static void main(String[] args) {
		
		String name = "Amita";
		char target = 'h';
		System.out.println(search(name , target));
		
		//it will return char array
		System.out.println(Arrays.toString(name.toCharArray()));
	}
	static boolean search(String str ,char target) {
		if(str.length() == 0) {
			return false;
		}
//		for(int i = 0 ; i < str.length() ; i++) {
//			if(target == str.charAt(i)) {
//				return true;
//			}
//		}
//			return false;
		
		//instead of this for loop we can use for each loop
		//here it is
		
		for(char ch : str.toCharArray()) {
			if (ch == target) {
				return true;
			}
		}
		return false;
		
	}
}

public class Main{
  public static void main(String[] args){
    int[] nums ={23,45,1,2,8,19,-3,16,-11,28};
    int target = 19;
    int ans = linearSearch(nums , target);
    System.out.println(ans);
  }
  //search in the array return the true or false if item found 
  //otherwise if item not found return false
  static boolean linearSearch(int[] arr, target){
    if(arr.length == 0){
      return false;
    }
    //run a for loop 
    for(int index = 0; index < arr.length; index++){
      //check for element at every index if it is target
      int element = arr[index];
      if(element == target){
        return true;
      }
    }
    //this line will execute if none of the return statement above have executed
    //hence the target not found
    return false;
  }
}

//To find out whether the given String is Palindrome or not.
import java.util.*;
class PalindromOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :- ");
        String s = sc.nextLine();
        
        palindrome(s);
    }
    
    static void palindrome(String str){
        String rev = "";
        
        for(int i = str.length()-1 ; i >=0 ; i--){
            rev += str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
    }
}

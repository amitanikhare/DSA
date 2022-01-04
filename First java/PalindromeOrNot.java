//To find out whether the given String is Palindrome or not.
import java.util.*;
class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :- ");
        String s = sc.nextLine();
        String rev = "";
        
        for(int i = s.length()-1 ; i >=0 ; i--){
            rev += s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
    }
}

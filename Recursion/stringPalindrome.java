import java.util.*;
public class stringPalindrome {

    public static boolean checkPalindrome(String str, int i){
        if(i >= str.length()/2){
            System.out.println("The given string is palindrome.");
            return true;
        }

        if(str.charAt(i) != str.charAt(str.length()-i-1)){
            System.out.println("The given string is not palindrome.");
            return false;
        }

        return checkPalindrome(str, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        checkPalindrome(str,0);
        sc.close();
    }
}

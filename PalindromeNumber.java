package leetcodeProblems;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = -121;
        System.out.print(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int originalNumber = x;
        if(x<0) return false;
        while(x !=0){
            int remainder = x%10;
            reverse = (reverse*10) + remainder;
            x /=10;
        }
        if(reverse == originalNumber){
            return true;
        }
        return false;
    }
}
/*
Given a string s, return the longest palindromic substring in s.

Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.
*/

package leetcodeProblems;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s==null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i<=s.length()-1; i++) {
            int len1 = expandFromMiddle(s, i, i);
            int len2 = expandFromMiddle(s, i, i+1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
        }
        return s.substring(start, end + 1);
    }

    public static int expandFromMiddle(String s, int left, int right) {
        if (s==null || left > right) return 0;
        while (left >= 0 && right <= s.length()-1 && s.charAt(left)==s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String s = "abaccabe";
        String s1 = "babad";
        String s2 = "aabaa";
        System.out.println(longestPalindrome(s));
    }
}

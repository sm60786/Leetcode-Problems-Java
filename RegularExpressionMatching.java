package leetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RegularExpressionMatching {

    /*

    Given an input string 's' and pattern 'p', implement regular expression matching with support for '.' and '*' where :
    '.' = Matches any Single Character
    '*' = Matches zero or more of the preceding element
    The matching should cover the entire input string (not partial)

    Example 1:

    Input: s = "aa", p = "a"
    Output: false
    Explanation: "a" does not match the entire string "aa".
    Example 2:

    Input: s = "aa", p = "a*"
    Output: true
    Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
    Example 3:

    Input: s = "ab", p = ".*"
    Output: true
    Explanation: ".*" means "zero or more (*) of any character (.)".

     */

	int strLength, ptnLength; // Lengths of string s and pattern p

    // Recursive function to check if there is a match between s and p
    public boolean isMatch(int si, int pi, String s, String p, int[][] dp) {
        // If both strings have been exhausted, return true
        if (si >= strLength && pi >= ptnLength)
            return true;

        // If pattern is exhausted but string is not, return false
        if (si < strLength && pi >= ptnLength)
            return false;

        // If string is exhausted but pattern still has elements
        if (si >= strLength && pi < ptnLength) {
            // If remaining pattern consists of only '*' characters, return true
            pi++;
            while (pi < ptnLength) {
                if (p.charAt(pi) != '*') return false;
                pi += 2;
            }
            if (p.charAt(ptnLength - 1) != '*') return false;
            return true;
        }

        // If the result for current state (si, pi) is already computed, return it
        if (dp[si][pi] != -1)
            return dp[si][pi] == 1;

        // If the next character in pattern is '*', handle it
        if (pi < ptnLength - 1 && p.charAt(pi + 1) == '*') {
            // Case 1: Don't use the '*' character
            boolean notUse = isMatch(si, pi + 2, s, p, dp);
            // Case 2: Use the '*' character
            boolean use = (s.charAt(si) == p.charAt(pi) || p.charAt(pi) == '.') && isMatch(si + 1, pi, s, p, dp);
            dp[si][pi] = (notUse || use) ? 1 : 0;
            return notUse || use;
        }
        // If the next character in pattern is '.' or matches the current character in string
        else if (p.charAt(pi) == '.' || s.charAt(si) == p.charAt(pi)) {
            boolean result = isMatch(si + 1, pi + 1, s, p, dp);
            dp[si][pi] = result ? 1 : 0;
            return result;
        }

        dp[si][pi] = 0;
        return false;
    }

    public boolean isMatch(String s, String p) {
    	strLength = s.length();
    	ptnLength = p.length();
        int[][] dp = new int[strLength + 1][ptnLength + 1]; // Memoization table
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return isMatch(0, 0, s, p, dp); // Start the recursive function
    }

    public static void main(String[] args) {
    	RegularExpressionMatching rEM = new RegularExpressionMatching();
        String str = "aa", p = "a";
        String str1 = "aa", p1 = "a*";
        String str2 = "ab", p2 = ".*";
        System.out.println(rEM.isMatch(str1, p1));
    }

}

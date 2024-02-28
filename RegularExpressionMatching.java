package leetcodeProblems;

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

    public static boolean isMatch(String s, String p) {
        char[] ch = p.toCharArray();

        return false;
    }

    public static void main(String[] args) {
        String str = "aa", p = "a";
        String str1 = "aa", p1 = "a*";
        String str2 = "ab", p2 = ".*";
        System.out.println(isMatch(str, p));
    }

}

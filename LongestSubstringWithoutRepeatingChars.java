package leetcodeProblems;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingChars ls = new LongestSubstringWithoutRepeatingChars();
        String s = "pwwkew";

        int len = ls.lengthOfLongestSubstring(s);
        System.out.println(len);
        System.out.println(getCharCount(s));
    }
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int [] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        int left = 0;
        for (int right=0; right<n; right++) {
            if (charIndex[s.charAt(right)] >= left) {
                left = charIndex[s.charAt(right)] + 1;
            }
            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static HashMap getCharCount(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        char [] strArray = s.toCharArray();
        for (char c : strArray) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c)+1);
            } else {
                hm.put(c, 1);
            }
        }
        return hm;
    }
}

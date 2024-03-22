package leetcodeProblems;

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example 1:
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2:
Input: digits = ""
Output: []

Example 3:
Input: digits = "2"
Output: ["a","b","c"]

Constraints:

0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfAPhoneNumber {

    private static final Map<Character, char[]> LettersMap = Map.of(
            '2', "abc".toCharArray(),
            '3', "def".toCharArray(),
            '4', "ghi".toCharArray(),
            '5', "jkl".toCharArray(),
            '6', "mno".toCharArray(),
            '7', "pqrs".toCharArray(),
            '8', "tuv".toCharArray(),
            '9', "wxyz".toCharArray()
    );

    public static void backtracking(char[] digits, int pos, List<String> result, char[] word) {
        if (pos == digits.length) {
            result.add(new String(Arrays.copyOf(word, word.length)));
            return;
        }

        char digit = digits[pos];
        char[] letters = LettersMap.get(digit);
        for (char letter: letters) {
            word[pos] = letter;
            backtracking(digits, pos + 1, result, word);
        }
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return List.of();
        }
        List<String> result = new ArrayList<>();
        char[] word = new char[digits.length()];
        backtracking(digits.toCharArray(), 0, result, word);

        return result;
    }

    public static void main(String[] args) {
        String digits1 = "23";
        String digits2 = "";
        String digits3 = "2";

        System.out.println(letterCombinations(digits1));
        System.out.println(letterCombinations(digits2));
        System.out.println(letterCombinations(digits3));
    }

}

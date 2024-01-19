/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1],
then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21

Constraints: -231 <= x <= 231 - 1
 */
package leetcodeProblems;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = -123;
        int x1 = 120;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int num = x;
        // Declare a reversed integer as 0
        int reversed = 0;
        // Make the negative integer positive
        if (num < 0) {
            num = -(num);
        }
        while (num != 0) {
            int remainder = num % 10;
            if (reversed > (Integer.MAX_VALUE - remainder) / 10) {
                return 0;
            }
            // Add the digit in reverse
            reversed = (reversed * 10) + remainder;
            // Reinitialize the num value
            num /= 10;
        }
        // Condition to check if given number is negative then add '-'
        // else return as it is
        if (x < 0) reversed = -(reversed);
        return reversed;
    }
}

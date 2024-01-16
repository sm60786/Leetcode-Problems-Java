// Get the Array of numbers between two numbers
// 1 to 4 ==> [1, 2, 3, 4]
// 1 to 10 ==> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

package leetcodeProblems;

import java.util.Arrays;

public class GetNumbersOf_Array_Between_TwoNumbers {
    public static void main(String[] args) {
        int a = 1, b = 10;
        System.out.println(Arrays.toString(between(a, b)));
    }
    public static int[] between(int a, int b) {
        int [] bet = new int[(b-a) + 1];
        int index = 0;
        for (int i=a; i<=b; i++) {
            bet[index++] = i;
        }
        return bet;
    }
}

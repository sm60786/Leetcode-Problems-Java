package leetcodeProblems;

import java.util.Scanner;

public class SpecialSumOfArray {
    public static void main(String[] args) {
        int [] arr = {9, 9, 9};
        int len = arr.length;
        System.out.println(checkSpecialSumOfArray(len, arr));
    }
    public static int checkSpecialSumOfArray(int arrLen, int [] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give array Length : ");
        System.out.println("Give the numbers which will be in array : ");
        int sum = 0;
        for (int i = 0; i<=arrLen-1; i++) {
            sum = sum + arr[i];
            if (sum > 10) {
                sum = 0;
                int remainder = sum % 10;
                sum = sum / 10;
            }
        }
        return sum;
    }
}

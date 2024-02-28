// Given integer = 371
// Numbers are in this given integer = 3
// So 3^3 + 7^3 + 1^3 = 371
package leetcodeProblems;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number : ");
        int x = scanner.nextInt();
        int z = x;
        int count = 0, sum = 0;
        while (z > 0) {
            int remainder = z % 10;
            count++;
            z = z / 10;
        }
        int result = checkArmstrongNumber(x, count, sum);
        if (result == x) {
            System.out.println("Armstrong Number");
        } else System.out.println("Not an Armstrong Number");
        scanner.close();
    }
    public static int cubeOfNumber(int number, int power) {
        return (int) Math.pow(number, power);
    }
    public static int checkArmstrongNumber(int number, int power, int sum) {
        while (number > 0) {
            int remainder = number % 10;
            sum = sum + (cubeOfNumber(remainder, power));
            number = number / 10;
        }
        return sum;
    }
}

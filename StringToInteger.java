package leetcodeProblems;

public class StringToInteger {
    public static void main(String[] args) {
        String s = "-42";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        long number = 0;
        char [] chars = s.toCharArray();
        if (chars.length == 0) return 0;
        int index = 0, sign = 1;
        char current = chars[index];

        // Remove Spaces
        while (current == ' ') {
            index++;
            if (index == chars.length) return 0;
            current = chars[index];
        }

        // Check if number has '-' or '+' sign in String
        if (current == '-') {
            sign = -1;
            index++;
        } else if (current == '+') {
            sign = 1;
            index++;
        }

        for (; index<=chars.length-1; index++) {
            current = chars[index];
            if (current < '0' || current > '9') break;
            else {
                number *= 10;
                number += current - '0';
                if (sign * number <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
                else if (sign * number > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            }
        }
        number *= sign;
        return (int) number;
    }
}

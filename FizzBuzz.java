package leetcodeProblems;

import com.beust.ah.A;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.


Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 */

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 15 ==0) {
                list.add(idx, "FizzBuzz");
            } else if (i % 5 == 0) {
                list.add(idx, "Buzz");
            } else if (i % 3 == 0) {
                list.add(idx, "Fizz");
            } else {
                list.add(idx, String.valueOf(i));
            }
            idx++;
        }
        return list;
    }

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        int n3 = 15;

        System.out.println(fizzBuzz(n1));
        System.out.println(fizzBuzz(n2));
        System.out.println(fizzBuzz(n3));
    }

}

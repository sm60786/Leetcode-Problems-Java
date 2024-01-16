package leetcodeProblems;

import java.util.Arrays;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String s = "You are awesome";
        String reverse = "";
        String [] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        for (int i=0; i<=words.length-1; i++) {
            String word = words[i];
            for (int j=word.length()-1; j>=0; j--) {
                reverse += word.charAt(j);
            }
            reverse = reverse + " ";
        }
        System.out.println(reverse);
    }
}

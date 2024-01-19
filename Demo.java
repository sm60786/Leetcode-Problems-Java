package leetcodeProblems;

public class Demo {
    public static void main(String[] args) {
        String s = "421";
        int number = 0;
        for (int i = 0; i<=s.length()-1; i++) {
            if (Character.isDigit(s.charAt(i))) {
                number = (number * 10) + s.charAt(i);
            }
        }
        System.out.println(number);
    }
}

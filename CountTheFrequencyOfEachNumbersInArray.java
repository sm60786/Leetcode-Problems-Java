package leetcodeProblems;

public class CountTheFrequencyOfEachNumbersInArray {

    public static void main(String[] args) {
        int [] arr = {10, 2, 3, 4, 10, 2, 3, 10};
        int [] freq = new int[arr.length];
        int visited = -1;
        for (int i=0; i<=arr.length-1; i++) {
            int count = 1;
            for (int j=i+1; j<=arr.length-1; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited;
                }
            }
            if (freq[i] != visited) {
                freq[i] = count;
            }
        }
        for(int i = 0; i < freq.length; i++){
            if(freq[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + freq[i]);
        }
        System.out.println("---------------------");
    }
}

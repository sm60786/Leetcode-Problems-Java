package leetcodeProblems;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int [] nums = {2, 2};
        System.out.println(Arrays.toString(findErrorNums_1(nums)));
        System.out.println(Arrays.toString(findErrorNums_2(nums)));
        System.out.println(Arrays.toString(findErrorNums_3(nums)));
    }

    // 1 ms time
    public static int[] findErrorNums_1(int[] nums) {
        int x[] = new int[nums.length+1];
        for(int i:nums){
            x[i]++;
        }
        int dup=0 , miss=0;
        for(int i=1;i<x.length;i++){
            if(x[i]==2){
                dup=i;
            }
            if(x[i] ==0){
                miss=i;
            }
        }
        return new int[]{dup,miss};
    }
    // 2 ms time
    public static int[] findErrorNums_2(int[] nums) {
        int N = nums.length, sum = N * (N + 1) / 2;
        int[] result = new int[2];
        boolean[] seen = new boolean[N+1];
        for (int num : nums) {
            sum -= num;
            if (seen[num]) result[0] = num;
            seen[num] = true;
        }
        result[1] = sum + result[0];
        return result;
    }
    // 3 ms time
    public static int[] findErrorNums_3(int[] nums) {
        int arrayLen = nums.length;
        int dup = -1, missing = -1;
        for (int i = 0; i < arrayLen; i++) {
            if (nums[Math.abs(nums[i]) - 1] < 0) {
                dup = Math.abs(nums[i]);
            } else {
                nums[Math.abs(nums[i]) - 1] *= (-1);
            }
        }
        for (int i = 0; i < arrayLen; i++) {
            if (nums[i] > 0) {
                missing = (i + 1);
                break;
            }
        }
        return new int[] {dup, missing};
    }
}

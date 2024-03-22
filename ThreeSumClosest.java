package leetcodeProblems;

import java.util.Arrays;

/*
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.



Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 */

public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSums = nums[0] + nums[1] + nums[2]; // Initialize closest sums of first 3 elements

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - sum) < Math.abs(target - closestSums)) {
                    closestSums = sum; // Update closest sum if the current sum is closer to the target
                }
                if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return closestSums;
    }

    public static void main(String[] args) {

        int[] nums1 = {-1,2,1,-4};
        int target1 = 1;

        int[] nums2 = {0, 0, 0};
        int target2 = 1;

        System.out.println(threeSumClosest(nums1, target1));
        System.out.println(threeSumClosest(nums2, target2));
    }

}

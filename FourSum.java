package leetcodeProblems;

import java.util.*;

/*
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

Example 2:
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 */

public class FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int k = j + 1;
                int l = len - 1;
                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        List<Integer> aL = new ArrayList<>();
                        aL.add(nums[i]);
                        aL.add(nums[j]);
                        aL.add(nums[k]);
                        aL.add(nums[l]);

                        set.add(aL);
                        k++;
                        l--;
                    }
                    else if (sum < target) k++;
                    else if (sum > target) l--;
                }
            }
        }
        ans.addAll(set);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,0,-1,0,-2,2};
        int target1 = 0;
        System.out.println(fourSum(nums1, target1));

        int[] nums2 = {2,2,2,2,2};
        int target2 = 8;
        System.out.println(fourSum(nums2, target2));

    }

}

package leetcodeProblems;

/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.



Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1


Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104
 */

import net.bytebuddy.asm.Advice;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ContainerWithMostWater {

    public static int maxAreaOwnWay(int[] height) {
        int area = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (height[i] > height[j]) {
                    area = Math.max(area, height[j] * (j - i));
                } else if (height[i] == height[j]) {
                    area = Math.max(area, height[i] * (j - i));
                } else {
                    area = Math.max(area, height[i] * (j - i));
                }
            }
        }
        return area;
    }

    public static int maxAreaLeetCodeWay(int[] height) {
        int l = 0, r = height.length - 1, max = 0, volume = 0, minHeight;
        while(l < r) {
            minHeight = Math.min(height[l], height[r]);
            volume = (r-l) * minHeight;
            if(volume > max) {
                max = volume;
            }
            while(l < r && height[l] <= minHeight) {
                l++;
            }
            while(l < r && height[r] <= minHeight) {
                r--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height1 = {1,8,6,2,5,4,8,3,7};
        int[] height2 = {1, 2};
        System.out.println(maxAreaOwnWay(height1));
        System.out.println(maxAreaLeetCodeWay(height1));
    }

}

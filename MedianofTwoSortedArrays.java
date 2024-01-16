package leetcodeProblems;

import java.util.Arrays;

public class MedianofTwoSortedArrays {

    // Code Brute Force - Merge and Sort
    public static double findMedianSortedArrays(int [] nums1, int [] nums2) {
        // Get the sizes of both arrays
        int n1 = nums1.length;
        int n2 = nums2.length;

        // Merge the arrays into a single sorted array
        int [] merged = new int[n1 + n2];
        int k = 0;
        for (int i=0; i<=n1-1; i++) {
            merged[k++] = nums1[i];
        }
        for (int i=0; i<=n2-1; i++) {
            merged[k++] = nums2[i];
        }

        // Sort the merged array
        Arrays.sort(merged);

        // Calculate the total number of elements in the merged array
        int lengthOfMergedArray = merged.length;

        if (lengthOfMergedArray % 2 == 1) {
            return (double) merged[lengthOfMergedArray / 2];
        } else {
            int middle1 = merged[lengthOfMergedArray / 2 - 1];
            int middle2 = merged[lengthOfMergedArray / 2];
            return ((double) middle1 + (double) middle2) / 2;
        }
    }

    public static void main(String[] args) {
        int [] n1 = {1, 2, 3};
        int [] n2 = {4, 5, 7};
        System.out.print(findMedianSortedArrays(n1, n2));
    }

}

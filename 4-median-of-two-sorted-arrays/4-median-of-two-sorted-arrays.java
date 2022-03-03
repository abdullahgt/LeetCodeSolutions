import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
   /*     double val1;
        double val2;
        if (nums1.length == 0) {
            val1 = 0;
        }
        else if (nums1.length == 1) {
            val1 = nums1[0];
        }
        else if (nums1.length % 2 != 0) {
            val1 = nums1[(nums1.length + 1)/2];
        } else {
            val1 = (double)(nums1[nums1.length/2] + nums1[(nums1.length/2) - 1]) / 2.0;
        }
         if (nums2.length == 0) {
            val2 = 0;
        } else if (nums2.length == 1) {
            val2 = nums2[0];
        }
        else if (nums2.length % 2 != 0) {
            val2 = nums2[(nums2.length + 1)/2];
        } else {
            val2 = (double)(nums2[nums2.length/2] + nums2[(nums2.length/2) - 1]) / 2.0;
        }
        if (nums1.length != 0 && nums2.length != 0) {
        double result = (val1 + val2)/2.0;
            return result;
        } else if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        } else if (nums1.length == 0) {
            return val2;
        } else {
            return val1;
        }
       // System.out.println(val1);
        //System.out.println(val2);
        */
        // Check if num1 is smaller than num2
        // If not, then we will swap num1 with num2
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        // Lengths of two arrays
        int m = nums1.length;
        int n = nums2.length;
        // Pointers for binary search
        int start = 0;
        int end = m;
        // Binary search starts from here
        while (start <= end) {
            // Partitions of both the array
            int partitionNums1 = (start + end) / 2;
            int partitionNums2 = (m + n + 1) / 2 - partitionNums1;
            // Edge cases
            // If there are no elements left on the left side after partition
            int maxLeftNums1 = partitionNums1 == 0 ? Integer.MIN_VALUE : nums1[partitionNums1 - 1];
            // If there are no elements left on the right side after partition
            int minRightNums1 = partitionNums1 == m ? Integer.MAX_VALUE : nums1[partitionNums1];
            // Similarly for nums2
            int maxLeftNums2 = partitionNums2 == 0 ? Integer.MIN_VALUE : nums2[partitionNums2 - 1];
            int minRightNums2 = partitionNums2 == n ? Integer.MAX_VALUE : nums2[partitionNums2];
            // Check if we have found the match
            if (maxLeftNums1 <= minRightNums2 && maxLeftNums2 <= minRightNums1) {
                // Check if the combined array is of even/odd length
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxLeftNums1, maxLeftNums2) + Math.min(minRightNums1, minRightNums2)) / 2.0;
                } else {
                    return Math.max(maxLeftNums1, maxLeftNums2);
                }
            }
            // If we are too far on the right, we need to go to left side
            else if (maxLeftNums1 > minRightNums2) {
                end = partitionNums1 - 1;
            }
            // If we are too far on the left, we need to go to right side
            else {
                start = partitionNums1 + 1;
            }
        }
        // If we reach here, it means the arrays are not sorted
        throw new IllegalArgumentException();
        
        
    }
}
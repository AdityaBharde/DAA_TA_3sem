package DAA_TA_2;

import java.util.*;
public class Q1 {
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res,1);
        for (int i = 1; i <n;i++) {
            for (int j = 0; j <i ; j++) {
                if(nums[i]>nums[j]){
                    res[i]=Math.max(res[i],res[i]+1 );
                }
            }
        }
        int max=0;
        for(int a: res){
            max=Math.max(max,a);
        }
        return max;

    }
    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {10,9,2,5,3,7,101,18};
        System.out.println("Test Case 1: "+Arrays.toString(nums1));
        System.out.println("Length of LIS: "+lengthOfLIS(nums1));

        // Test Case 2
        int[] nums2 = {0,1,0,3,2,3};
        System.out.println("\nTest Case 2: "+Arrays.toString(nums2));
        System.out.println("Length of LIS: "+lengthOfLIS(nums2));

        // Test Case 3
        int[] nums3 = {7,7,7,7,7,7};
        System.out.println("\nTest Case 3: "+Arrays.toString(nums3));
        System.out.println("Length of LIS: "+lengthOfLIS(nums3));
    }

}

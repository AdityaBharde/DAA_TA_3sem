import java.util.*;
public class Q2 {
    public static List<Integer> subset(int [] nums){
        int n= nums.length;
        Arrays.sort(nums);
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int[] p=new int [n];
        Arrays.fill(p,-1);
        int maxIndex=0;
        int maxLength=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] %nums[j]==0) {
                    if (dp[j]+1>dp[i]) {
                        dp[i]=dp[j]+1;
                        p[i]=j;
                    }
                }
            }
            if (dp[i] > maxLength) {
                maxLength =dp[i];
                maxIndex =i;
            }
        }
        List<Integer> result = new ArrayList<>();
        int i = maxIndex;
        while (i !=-1) {
            result.add(nums[i]);
            i =p[i];
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {1, 2, 3};
        System.out.println(subset(nums1));
        // Test Case 2
        int[] nums2 = {546, 60, 4, 30, 90};
        System.out.println(subset(nums2));
        // Test Case 3
        int[] nums3 = {1, 16, 7, 8, 4};
        System.out.println(subset(nums3));
    }
}

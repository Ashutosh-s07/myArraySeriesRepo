import java.util.*;

// https://leetcode.com/problems/wiggle-sort-ii/description/

public class WiggleSortII {
    public static void wiggleSort(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int n = nums.length;
        int i = (n - 1) >> 1, j = n - 1;
        System.out.println(i+" "+j);
        for (int x = 0; x < n; ++x) {
            if (x % 2 == 0) {
                nums[x] = arr[i--];
            } else {
                nums[x] = arr[j--];
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        // int[] nums = {1,1,2,1,2,2,1};
        int[] nums = {1,4,3,4,1,2,1,3,1,3,2,3,3};
        wiggleSort(nums);
    }
}

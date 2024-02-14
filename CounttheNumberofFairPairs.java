import java.util.*;

public class CounttheNumberofFairPairs {
    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return find_count(nums,upper) - find_count(nums,lower-1);
    }

    public static long find_count( int[] nums, int value){
        int l = 0, r = nums.length-1;
        long result = 0;
        while ( l<r ){
            int sum = nums[l]+nums[r];
            if(sum <= value ){
                result += (r-l);
                l++;
            }
            else r--;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {0,1,7,4,4,5};
        int lower = 3, upper = 6;
        System.out.println(countFairPairs(nums, lower, upper));
    }
}

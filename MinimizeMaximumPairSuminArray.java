import java.util.Arrays;

public class MinimizeMaximumPairSuminArray {

    public static int minPairSum(int[] nums) {
        int result = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for( int i=0;i<n/2;i++ ){
            result = Math.max(result,nums[i]+nums[n-1-i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {3,5,2,3};
        System.out.println(minPairSum(nums));
    }
}

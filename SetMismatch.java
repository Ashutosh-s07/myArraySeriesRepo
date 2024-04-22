import java.util.Arrays;

public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int total_sum = nums[nums.length-1], natural_sum =n*(n+1)/2, duplicate = 0;

        for( int i=0;i<n-1;i++){
            total_sum += nums[i];
            if(nums[i]==nums[i+1]) {
                duplicate=nums[i];
            }
        }
        System.out.println(duplicate);
        return new int[]{duplicate,natural_sum-(total_sum-duplicate)};
    }
    public static void main(String[] args) {
        int[] nums = {2,3,2};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        
        int sum = 0, result = Integer.MIN_VALUE, start = 0;
        while(start<nums.length){
            sum += nums[start];
            result = Math.max(result, sum);
            if( sum<0 ) sum=0;
            start++;
        }
        return result;
    }
    public static void main(String[] args) {
        // int[] nums = {-1};
        // int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }
}

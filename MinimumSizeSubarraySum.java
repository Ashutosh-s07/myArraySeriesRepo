public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0;
        int sum = 0,len = Integer.MAX_VALUE;
        while( j<nums.length ){
            sum += nums[j];
            while( sum>= target ){
                // System.out.println(sum+" "+len);
                len = Math.min( len, j-i+1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return len==Integer.MAX_VALUE?0:len; 
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1};
        int target = 11;
        System.out.println(minSubArrayLen(target, nums));
    }
}

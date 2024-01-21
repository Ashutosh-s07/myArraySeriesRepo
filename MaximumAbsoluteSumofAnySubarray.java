public class MaximumAbsoluteSumofAnySubarray {
    public static int maxAbsoluteSum(int[] nums) {
        int minSum = Integer.MAX_VALUE, maxSum = Integer.MIN_VALUE, currentMinSum = 0, currentMaxSum = 0;
        for(int num: nums) {
            currentMaxSum += num;
            //Kadane Max SubarraySum
            maxSum = Math.max(maxSum, currentMaxSum);
            if (currentMaxSum < 0)
                currentMaxSum = 0;
            
            //Kadane Min SubarraySum
            currentMinSum += num;
            minSum = Math.min(minSum, currentMinSum);
            if (currentMinSum > 0)
                currentMinSum = 0;
        }
        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }
    public static void main(String[] args) {
        int[] nums = {1,-3,2,3,-4};
        System.out.println(maxAbsoluteSum(nums));
    }
}

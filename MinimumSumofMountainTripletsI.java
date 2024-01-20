public class MinimumSumofMountainTripletsI {
    public static int minimumSum(int[] nums) {
        int n = nums.length;
        int minSum = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int lo = i+1, hi = lo+1;
            while(lo<n && hi< n){
                if(nums[i] < nums[lo] && nums[hi] < nums[lo]){
                    int sum = nums[i] + nums[lo] + nums[hi];
                    minSum = Math.min(minSum, sum);                   
                }
                hi++;
                if (hi >= n) {
                    lo++;
                    hi = lo + 1;
                }
            }
        }
        return minSum == Integer.MAX_VALUE ? -1 : minSum;    

    }
    public static int minimumSumII(int[] nums) {
        int len=nums.length;
      int left[]=new int[len];
      int right[]=new int[len];
      left[0]=nums[0];
      for(int i=1;i<len;i++)
      {
        left[i]=Math.min(left[i-1],nums[i]);
      }
      right[len-1]=nums[len-1];
      for(int i=len-2;i>=0;i--)
      {
        right[i]=Math.min(right[i+1],nums[i]);
      }
      int ans=Integer.MAX_VALUE;
      for(int i=1;i<len-1;i++)
      {
        if(nums[i]>left[i-1] && nums[i]>right[i+1])
        {
          ans=Math.min(ans,left[i]+right[i]+nums[i]);
        }
      }
      return ans == Integer.MAX_VALUE ? -1 : ans;    

    }
    public static void main(String[] args) {
        int[]  nums = {5,4,8,7,10,2};
        System.out.println(minimumSum(nums));
    }
}

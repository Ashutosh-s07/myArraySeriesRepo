// https://leetcode.com/problems/longest-nice-subarray/description/
public class LongestNiceSubarray {
    public static int longestNiceSubarray(int[] nums) {
        int num = 0;
        int j =0;
        int ans  = 0;
        for( int i=0;i<nums.length;i++){
            while ((num & nums[i]) != 0) num ^= nums[j++];
            num |= nums[i];
            ans = Math.max(ans, i-j+1);
        }
        return ans;
    }
    public static int longestNiceSubarray2(int[] nums) {
        int and = 0;
        int ans  = 0;
        for(int i=0;i<nums.length;i++){
            ans = 0;
            for( int j=i;j<nums.length;j++){
                and &= nums[j];
                if( and == 0 ) ans = Math.max(ans, i-j+1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // int[] nums = {1,3,8,48,10};
        int[] nums = {744437702,379056602,145555074,392756761,560864007,934981918,113312475,1090,16384,33,217313281,117883195,978927664};
        // int[] nums = {3,1,5,11,13};
        System.out.println(longestNiceSubarray2(nums));
    }
}

// https://leetcode.com/problems/3sum-closest/description/
import java.util.Arrays;

public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int lo=i+1;
            int hi=nums.length-1;
            while(lo<hi){
            int sum=nums[i]+nums[lo]+nums[hi];
             if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum; 
                }
            if(sum>target) hi--;
            else lo++;
            }
        }
        return closestSum;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,0};
        int target = 1;
        System.out.println( threeSumClosest(nums, target));
    }
    
}
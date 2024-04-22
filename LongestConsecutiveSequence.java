import java.util.*;

public class LongestConsecutiveSequence {
     public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int count = 0;
        int maxi = 0;
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i]-1)){
                count = 1;
                while(hs.contains(nums[i]+count)) {
                    count++;
                }
                maxi = Math.max(count,maxi);
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        // int[] nums = {100,4,200,1,3,2};
        int[] nums = {3,7,2,5,8,4,6,0,1,2};
        System.out.println(longestConsecutive(nums));
    }
}

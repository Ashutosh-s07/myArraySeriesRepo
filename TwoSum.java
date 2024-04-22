import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for( int i=0;i<nums.length;i++){
            if( mp.containsKey(target-nums[i])) return new int[]{mp.get(target-nums[i]),i};
            mp.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(twoSum(nums, target));
    }
}

import java.util.HashMap;

public class SubarrayswithKDifferentIntegers {
    public static int subarraysWithKDistinct(int[] nums, int k) {
        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int l = 0, r = 0;
        while (r<nums.length) {
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            if( map.size()>k ){
                map.put(nums[l],map.get(nums[l])-1);
                l++;
            }
            // if( map.get(nums[l])==1) map.remove(nums[l]);
            System.out.println(map);
            if( map.size()==k ) result++;
            r++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,3}; 
        int k = 2;
        System.out.println(subarraysWithKDistinct(nums, k));   
    }
}

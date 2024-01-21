import java.util.*;

public class FourSumII {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int k : nums3)
            for(int l : nums4)
                map.put(k + l, map.getOrDefault(k + l, 0) + 1);
        System.out.println(map);
        int count = 0;
        for(int i : nums1)
            for(int j : nums2)
                    count += map.getOrDefault(-(i + j), 0);
                    // count += map.get(-(i+j));
        System.out.println(map);
        return count;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1,2}, nums2 = {-2,-1}, nums3 = {-1,2}, nums4 = {0,2};
        System.out.println(fourSumCount(nums1, nums2, nums3, nums4));
    }
}

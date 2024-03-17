import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionofTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> duplicate = new HashMap<>();
        HashMap<Integer,Integer> result = new HashMap<>();

        for( int i:nums1 ) duplicate.put(i,0);
        for( int i:nums2 ) if( duplicate.containsKey(i) ) result.put(i,0);
        
        int[] sol = new int[result.size()];
        int ind = 0;
        for( Map.Entry<Integer,Integer> entry:result.entrySet()) sol[ind++]=entry.getKey();
        return sol;

    }
    public static void main(String[] args) {
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));        
    }
}

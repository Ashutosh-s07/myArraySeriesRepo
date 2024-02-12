import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementII {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        Arrays.sort(nums);
        int count = 0;
        System.out.println(Arrays.toString(nums));
        for( int i=0; i<nums.length-1; i++ ){
            if( nums[i]==nums[i+1] ) count++;
            if( count >= nums.length/3 ){
                count = 0;
                result.add(nums[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(majorityElement(nums));
    }
}

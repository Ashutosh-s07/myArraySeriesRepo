import java.util.Arrays;
import java.util.HashMap;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int missing_ele = 1;
        for( int i=0;i<nums.length;i++ ){
            if( nums[i]<=0) continue;
            else{
                if(missing_ele == nums[i]) missing_ele++;
                else if( missing_ele<nums[i] ) break;
            }
        }
        return missing_ele;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println(firstMissingPositive(nums));
    }
}

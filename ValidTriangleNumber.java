import java.util.Arrays;

public class ValidTriangleNumber {
    public static int triangleNumber(int[] nums) {
        int result = 0;
        // Arrays.sort(nums);
        for( int i=0;i<nums.length-2;i++){
            for( int j=i+1;j<nums.length-1;j++){
                for( int k=j+1;k<nums.length;k++){
                    if(( nums[i]+nums[j]>nums[k]) && (nums[i]>0 && nums[j]>0 && nums[k]>0 )) result++;
                    if( nums[i]+nums[j]>nums[k] ) System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {7,0,0,0};
        System.out.println(triangleNumber(nums));
    }
}

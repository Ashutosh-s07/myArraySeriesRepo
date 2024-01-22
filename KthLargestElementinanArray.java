import java.util.Arrays;

public class KthLargestElementinanArray {
    public static int findKthLargest(int[] nums, int k) {
    
        int f_max = nums[0];
        int f_maxInd = 0;
        for( int i=0;i<nums.length;i++){
            if( f_max<nums[i] ) f_maxInd=i;
        }
        nums[f_maxInd-1]=-1;
        for( int i=0;i<nums.length;i++){
            if( f_max<nums[i] ) f_max = nums[i];
        }
        return f_max;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4}; 
        int k = 2;
        System.out.println(findKthLargest(nums,k));
    }
}

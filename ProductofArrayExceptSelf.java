import java.util.*;

public class ProductofArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        
        int result = 1;
        int count_zeroes = 0;
        int[] sol = new int[nums.length];

        for( int i=0;i<nums.length;i++){
            if( nums[i]==0 ) {
                sol[i]=0;
                count_zeroes++;
            }
            else result *= nums[i];
        }
        for( int i=0;i<nums.length;i++){
            if( nums[i]!=0 && count_zeroes>0) sol[i]=0;
            else if( count_zeroes==nums.length ) sol[i]=0;
            else if(nums[i]==0  ) sol[i]=result;
            else sol[i]=result/nums[i];
        }
        System.out.println(Arrays.toString(sol));
        return sol;
    }
    public static void main(String[] args) {
        // int[] nums = {-1,1,0,-3,3};
        // int[] nums = {1,2,3,4};
        int[] nums = {0,4,0};
        productExceptSelf(nums);
    }
}

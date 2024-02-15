import java.util.Arrays;

import javax.sound.midi.Soundbank;

public class FindPolygonWiththeLargestPerimeter{
    public static long largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
        long peri_sum = 0;
        for( int a:nums ) peri_sum += a;
        for( int i=nums.length-1;i>=0;i--){
            peri_sum -= nums[i];
            if( peri_sum>nums[i]) return peri_sum+nums[i];
        }
        return -1;

    }
    public static void main(String[] args) {
        // int[]  nums = {5,5,5};
        int[]  nums = {1,12,1,2,5,50,3};
        System.out.println(largestPerimeter(nums));
    }
}
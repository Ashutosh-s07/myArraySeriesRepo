public class MinimumEqualSumofTwoArraysAfterReplacingZeros {
    public static long minSum(int[] nums1, int[] nums2) {
        int nums1_0 = 0;
        int nums2_0 = 0;
        int nums1_sum = 0;
        int nums2_sum = 0;
        
        for( int i:nums1 ){
            nums1_0 += i>0?0:1;
            nums1_sum += Math.max(i,1);
        }
        for( int i:nums2 ){ 
            nums2_0 += i>0?0:1;
            nums2_sum += Math.max(i,1);
        }

        if( nums1_sum<nums2_sum && nums1_0 == 0 ) return -1;
        else if( nums1_sum>nums2_sum && nums2_0 == 0 ) return -1;
        
        return Math.max(nums1_sum,nums2_sum);
    }
    public static void main(String[] args) {
        int[] nums1 = {2,0,2,0}, nums2 = {1,4   }; 
        System.out.println(minSum(nums1,nums2));  
    }
}

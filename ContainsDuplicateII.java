public class ContainsDuplicateII {
    
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        
        for( int i=0;i<nums.length;i++){
            for( int j=i+1;j<nums.length;j++){
                if(( Math.abs(i-j)<=k) && nums[i]==nums[j] && i!=j) return true;
                else if( Math.abs(i-j)>k) {
                    i++;
                    j=i;
                }
                // System.out.println(i+" "+j);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,2,5};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
     
}
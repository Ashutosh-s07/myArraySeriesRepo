public class MaximumofOperationsWiththeSameScoreI {
    public static int maxOperations(int[] nums) {

        int ans = nums[0]+nums[1], count = 0;
        for( int i=0;i<nums.length-1;i+=2){
            if( nums[i]+nums[i+1]==ans ) count++;
            else break;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,3,2,4,2,3,3,1,3};
        System.out.println(maxOperations(nums));
    }
}

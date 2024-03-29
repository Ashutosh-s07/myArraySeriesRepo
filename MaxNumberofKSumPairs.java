import java.util.Arrays;

public class MaxNumberofKSumPairs {
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        int count = 0;
        while(i<j){
            System.out.println(j);
            if(nums[i]+nums[j] == k) {
                count++;
                i++;
                j--;
            }
            else if(nums[i]+nums[j] < k) i++;
            else j--;
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        // int[] nums = {1,2,3,4};
        int k = 2;
        System.out.println(maxOperations(nums, k));
    }
}

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        int i = 0, j = 1, count  = 0;
        while (j<nums.length) {
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
                count++;
            }
            j++;
        }
        // System.out.println(Arrays.toString(nums));
        return count+1;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int result  = 0;
        int l = 0, r = nums.length-1;
        while (l<r) {
            if( nums[l]==val && nums[r]!=val ) {
                swap(nums, l, r);
                result++;
                l++;
                r--;
            }
            r--;
        }
        return result;

    }

    public static void swap( int[] nums, int l, int r ){
        int temp = nums[r];
        nums[r] = nums[l];
        nums[l] = nums[r];  
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums,val));
    }
}

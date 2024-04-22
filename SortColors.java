public class SortColors {
    public static void sortColors(int[] nums) {
        int l=0, m = 0, h = nums.length-1;
        while ( m<=h ) {
            if( nums[m]==0 ){
                swap(nums, l,m);
                l++; m++;
            }
            else if( nums[m] == 1 ) m++;
            else{
                swap(nums, m, h);
                h--;
            }
        }
    }

    public static void swap( int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,};
        sortColors(nums);
    }
}

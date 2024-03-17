import java.util.ArrayList;
import java.util.Arrays;

public class PartitionArrayAccordingtoGivenPivot {
    public static int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();
        int l = 0, count = 0, q= 0;
        for( int i=0;i<nums.length;i++){
            if( nums[i]<pivot ) result[l++] = nums[i];
            if( nums[i]>pivot ) list.add(nums[i]);
            if( nums[i] == pivot ) count++;
        }
        for(int i=0;i<count+list.size();i++){
            if(i<count) result[l++]=pivot;
            else result[l++] = list.get(q++);
        }
        // System.out.println(Arrays.toString(result));

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-3,4,3,2};
        int pivot = 2;
        pivotArray(nums, pivot);
    }
}

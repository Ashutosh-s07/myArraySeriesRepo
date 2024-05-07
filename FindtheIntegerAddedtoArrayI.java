import java.util.*;

public class FindtheIntegerAddedtoArrayI {
    public static int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // boolean check = true;

        // int res = nums1[0]-nums2[0];
        // for( int i=1;i<nums1.length;i++){
        //     if(nums1[i]-nums2[i]==res ) check = true;
        // }

        return nums1[0]-nums2[0];
    }
    public static void main(String[] args) {
        int[] nums1 = {2,6,4}, nums2 = {9,7,5};
        System.out.println(addedInteger(nums1, nums2));   
    }
}

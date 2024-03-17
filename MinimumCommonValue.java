public class MinimumCommonValue {
    public static int getCommon(int[] nums1, int[] nums2) {
        int n = 0, m = 0;
        while (n<nums1.length && m<nums2.length) {
            if(nums1[n]==nums2[m]) return nums2[m];
            else if(nums1[n]<nums2[m]) n++;
            else m++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,6}, nums2 = {4,5,8,9};
        System.out.println(getCommon(nums1, nums2));
    }
}

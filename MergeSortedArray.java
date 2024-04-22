public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1, k = n+m-1;
        while (j>=0) {
            if( i>=0 && nums1[i]>nums2[j] ) nums1[k--]=nums1[i--];
            else nums1[k--]=nums2[j--];
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m = 3, n = 3;
        System.out.println(merge(nums1, m, nums2, n));
    }
}

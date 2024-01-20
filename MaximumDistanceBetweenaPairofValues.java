public class MaximumDistanceBetweenaPairofValues {
    public static int maxDistance2(int[] nums1, int[] nums2) {
        int result = 0, diff =0;
        int i = 0, j = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums2[j] >= nums1[i]){
                diff = j - i;
                result = Math.max(result,diff);
                j++;
            }
            else i++;
        }
        
        int ans=0;
        for(int p=0 ;p<nums1.length; p++){
            for(int q=p;q<nums2.length;q++){
             if(nums1[p]<=nums2[q] && p<=q){
                ans=Math.max(ans,(q-p));
             }
            }
        }
        return result;
        // return ans;
    }
    public static int maxDistance(int[] nums1, int[] nums2) {
        int d = 0;
        for(int i=0;i<nums1.length;i++){
            int start = i;
            int end = nums2.length-1;
            while(start <= end){
                int mid = start +  (end-start)/2;
                if(nums1[i] <= nums2[mid]){
                    d = Math.max(d,mid-i);
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return d;
    }
    public static int maxDistancebinarysearch(int find, int start, int[] nums2){
        int s = start;
        int e = nums2.length;
        while(s<e){
            int m = s+(e-s)/2;
            if( nums2[m]==find) return m;
            if( nums2[m]>find )s=m+1;
            else e=m;
        }
        return nums2[e-1];
    }
    public static void main(String[] args) {
        int[] nums1 = {55,30,5,4,2};
        int[] nums2 = {100,20,20,15,10,5};
        System.out.println(maxDistancebinarysearch(102, 2, nums2));
        // System.out.println(maxDistance(nums1,nums2));
    }
}

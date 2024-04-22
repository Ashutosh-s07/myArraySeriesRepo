import java.util.*;
public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> lst = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for( int i=0;i<nums.length;i++){
            if( i>0 && nums[i]==nums[i-1] ) continue;
            for( int j=i+1;j<n;j++ ){
                if( j>i+1 && nums[j]==nums[j-1] ) continue;
                int k = j+1, l = n-1;
                while ( k<l ) {
                    long sum = nums[i];
                    sum += nums[j]; sum += nums[k]; sum += nums[l];
                    if( sum == target ){
                        List<Integer> subL = new ArrayList<>();
                        subL.add(nums[i]); subL.add(nums[j]); subL.add(nums[k]); subL.add(nums[l]);
                        lst.add(subL);
                        k++; l--;

                        while ( k<l && nums[k]==nums[k-1] ) k++;
                        while ( k<l && nums[l]==nums[l-1] ) l--;
                    }

                    else if( sum<target ) k++;
                    else l--;

                }
            }
        }
        return lst;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2}; 
        int target = 0;
        System.out.println(fourSum(nums, target));
    }
}

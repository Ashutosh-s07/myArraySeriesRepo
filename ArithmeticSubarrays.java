import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarrays {
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();
        for( int i=0;i<l.length;i++ ){
            int[] ans = new int[r[i]-l[i]+1];
            for( int j=0;j<ans.length;j++ ){
                ans[j] = nums[l[i]+j];
            }
            result.add(check(ans));
        }
        return result;
    }

    public static boolean check(int[] ans){
        Arrays.sort(ans);
        int diff = ans[1]-ans[0];
        for( int i=2;i<ans.length;i++ ){
            if( ans[i]-ans[i-1] != diff ) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {4,6,5,9,3,7}, l = {0,0,2}, r = {2,3,5};
        System.out.println(checkArithmeticSubarrays(nums,l,r));   
    }
}

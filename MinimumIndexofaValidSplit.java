import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumIndexofaValidSplit {

    public static int minimumIndex(List<Integer> nums) {
        
        if(moore(nums) == -1 ) return -1;

        int element = moore(nums);
        int freq = 0;
        int minInd = -1;
        for( int i=0;i<nums.size();i++){
            if( element == nums.get(i)){
                freq++;
                if( freq*2>i+1){
                    minInd = i;
                    freq = 0;
                    break;
                }
            }
        }
        System.out.println(minInd);
        boolean flag = false;
        for( int i=minInd+1;i<nums.size();i++){
            if( element == nums.get(i)) {
                freq++;
                if( freq*2>nums.size()-(minInd+1)) flag = true;
            }
        }
        if(flag == true ) return minInd;
        return -1;
    }
    public static int moore(List<Integer> nums){
        int n = nums.size();
        int cnt = 0;
        int ele = 0;

        for( int i=0;i<n;i++){
            if( cnt == 0){
                cnt = 1;
                ele = nums.get(i);
            }
            else if( ele == nums.get(i)) cnt++;
            else cnt--;
        }

        int cnt1 = 0;
        for(int i=0;i<n;i++){
            if( nums.get(i) == ele) cnt1++;
        }
        if( cnt1 > (n/2)) return ele;
        return -1;
    }
    public static void main(String[] args) {
        // Integer[] ls = new Integer[] {1,2,2,2};
        // Integer[] ls = new Integer[] {3,3,3,3,7,2,2};
        Integer[] ls = new Integer[] {2,1,3,1,1,1,7,1,2,1};
        List<Integer> nums = Arrays.asList(ls);
        System.out.println(minimumIndex(nums));
    }
}

import java.util.HashMap;

public class ContiguousArray {
    public static int findMaxLength(int[] nums) {

        var map = new HashMap<Integer, Integer>();
        int max = 0;
        int currentDff = 0;
        for(int i = 0; i<nums.length; i++){
            currentDff += nums[i] == 1 ? 1 :-1;
            if(currentDff==0)   max = i + 1; 
            if(!map.containsKey(currentDff))   map.put(currentDff, i);
            else max = Math.max(max, i - map.get(currentDff));
        }
        return max;

    }


    
    public static void main(String[] args) {
        int[] nums = {0,1,1};
        System.out.println(findMaxLength(nums));
    }
}

import java.util.HashMap;

public class CountElementsWithMaximumFrequency {
    
    public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0, maxii = 0;
        for( int i:nums ) map.put(i,map.getOrDefault(i, 0)+1);
        for (int fr : map.values()) maxii = Math.max(maxii, fr);
        for (int fr : map.values()) if (fr == maxii)  sum += maxii;
        return sum; 
        // System.out.println(map);
        // return 0;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));
    }
}

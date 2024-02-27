import java.util.HashMap;

public class SplittheArray {
    public static boolean isPossibleToSplit(int[] nums) {
        boolean result = true;
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i:nums )
            map.put(i,map.getOrDefault(i,0)+1);
        
        for( int i:nums ){
            if( map.get(i)!=1 && map.get(i)!=2 ) return false; 
        }
        System.out.println(map);
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4};
        System.out.println(isPossibleToSplit(nums));
    }
}

// https://leetcode.com/problems/remove-linked-list-elements/description/
import java.util.Arrays;

public class FindTheOriginalArrayofPrefixXor {
    public static int[] findArray(int[] pref) {
        int xor = 0;
        int[] result = new int[pref.length];
        for( int i=0;i<pref.length;i++ ){
            result[i] = xor^pref[i];
            xor ^= result[i];
        }
        return result;
    
    }
    public static void main(String[] args) {
        int[] pref = {5};
        System.out.println(Arrays.toString(findArray(pref)));
    }
}

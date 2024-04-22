import java.util.*;

public class PartitionLabels {
    public static List<Integer> partitionLabels(String s) {


        List<Integer> result = new ArrayList<>();
        int last_index[] = new int[26];

        for( int i=0;i<s.length();i++) last_index[s.charAt(i)-'a'] = i;

        int st = 0, end = 0;
        for( int i=0;i<s.length();i++ ){
            end = Math.max(end,last_index[s.charAt(i)-'a']);
            if( i==end ) {
                result.add(end-st+1);
                st = end+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s));
    }
}

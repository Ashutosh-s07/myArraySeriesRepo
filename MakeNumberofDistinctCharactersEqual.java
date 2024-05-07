import java.util.HashMap;
import java.util.Map;

public class MakeNumberofDistinctCharactersEqual {
    public static boolean isItPossible(String word1, String word2) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for( char w1:word1.toCharArray() ) map1.put(w1,map1.getOrDefault(w1,0)+1);
        for( char w2:word2.toCharArray() ) map2.put(w2,map2.getOrDefault(w2,0)+1);
        
        if( map1.size() == map2.size() ) return true;

        int count_freqMap1 = 0 , count_freqMap2 = 0;
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) count_freqMap1 += entry.getValue();
        for (Map.Entry<Character, Integer> entry : map2.entrySet()) count_freqMap2 += entry.getValue();

        if( ((map1.size()-map2.size())==1) && Math.abs(count_freqMap1-count_freqMap2)==1) return true;
        else return false;
        
    }
    public static void main(String[] args) {
        String word1 = "ac", word2 = "b";
        System.out.println(isItPossible(word1, word2));
    }
}

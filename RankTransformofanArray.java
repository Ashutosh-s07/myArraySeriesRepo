import java.util.*;

public class RankTransformofanArray {
    public static int[] arrayRankTransform(int[] arr) {

        int[] dupli = Arrays.copyOf(arr, arr.length);
        Arrays.sort(dupli);
        HashMap<Integer,Integer> map = new HashMap<>();
        // int[] result = new int[arr.length];
        int j = 1;

        for( int i:dupli){
            if( !map.containsKey(i) ) map.put(i,j++);
            else  {
                map.put(i,(--j));
                j++;
            }
        }

        for( int i=0;i<dupli.length;i++){
            arr[i]=map.get(arr[i]);
        }

        return arr;
    }
    public static void main(String[] args) {
        // int[] arr = {37,12,28,9,100,56,80,5,12};
        // int[] arr = {40,10,20,20,30};
        int[] arr = {100,100,100};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
}

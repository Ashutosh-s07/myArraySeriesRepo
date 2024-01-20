import java.util.*;

public class FindPlayersWithZeroorOneLosses{

    public static void findWinners(int[][] matches) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> WinList = new ArrayList<>();
        List<Integer> LooseList = new ArrayList<>();

        for( int ind=0;ind<matches.length;ind++){
            // System.out.println(matches[ind][1]);
            if( !map.containsKey(matches[ind][0]) ){
                map.put(matches[ind][0],0);
            }
            if( map.containsKey(matches[ind][1]) ){
                map.put(matches[ind][1],map.get(matches[ind][1])+1);
            }
            else{
                map.put(matches[ind][1],1);
            }
        }
        for( int Player:map.keySet()){
            if( map.get(Player) == 0) WinList.add(Player);
            if( map.get(Player) == 1) LooseList.add(Player);
        }
        Collections.sort(LooseList);
        Collections.sort(WinList);
        result.add(WinList);
        result.add(LooseList);
        System.out.println(result);
        // return result;
    }
    public static void main(String[] args) {
        int[][]  matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        findWinners(matches);
    }
}
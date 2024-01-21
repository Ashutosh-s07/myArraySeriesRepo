// https://leetcode.com/problems/minimum-index-sum-of-two-lists/

import java.util.*;

class Pair{
    int indexSum;
    String str;
    public Pair( int indexSum, String str){
        this.indexSum = indexSum;
        this.str = str;
    }
}

public class MinimumIndexSumofTwoLists {
    
    public static String[] findRestaurant(String[] list1, String[] list2) {
        
        List<String> ls = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((f1,f2)->f1.indexSum-f2.indexSum);
        HashMap<String,Integer> map = new HashMap<>();
        int ind = 0;
        int lsInd = 0;
        for( String s : list2) map.put(s, ind++);
        
        for( int i=0;i<list1.length;i++){
            if(map.containsKey(list1[i])){
                int index = map.get(list1[i]);
                pq.add(new Pair(index+i, list1[i]));
            }
        }
        int min=0;
        do{
            min = pq.peek().indexSum;
            ls.add(pq.peek().str);
            pq.poll();
        }while(min==pq.peek().indexSum);

        // Pair temp = null;
        // while (!pq.isEmpty()) {
        //     if( temp == null) temp = pq.peek();
        //     else if( temp.indexSum != pq.peek().indexSum) break;
        //     ls.add(pq.remove().str);
        // }
        return ls.toArray(new String[ls.size()]);
    }


    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2)));
        // findRestaurant(list1, list2);
    }
}

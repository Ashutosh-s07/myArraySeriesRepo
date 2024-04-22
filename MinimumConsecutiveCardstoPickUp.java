import java.util.HashMap;

public class MinimumConsecutiveCardstoPickUp {
    public static int minimumCardPickup(int[] cards) {
        int len = Integer.MAX_VALUE;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for( int i=0;i<cards.length;i++ ){
            if( mp.containsKey(cards[i]) ) len = Math.min(len, i-mp.get(cards[i])+1);
            else mp.put(cards[i],i);
        }
        return len==Integer.MAX_VALUE?-1:len;
    }
    public static void main(String[] args) {
        int[] cards = {1,0,5,3};
        System.out.println(minimumCardPickup(cards));
    }
}

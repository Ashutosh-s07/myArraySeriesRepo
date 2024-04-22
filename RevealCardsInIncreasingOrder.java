import java.util.*;

public class RevealCardsInIncreasingOrder {
    public static int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n=deck.length;
        Queue<Integer>que=new LinkedList<>();
        for(int i=0;i<n;i++)  que.add(i);
        
        int sol[]=new int[n];
        for(int card:deck){
            int idx=que.poll();
            sol[idx]=card;
            if(!que.isEmpty()) que.add(que.poll());
        }
        return sol;
    }
    public static void main(String[] args) {
        int[] deck = {17,13,11,2,3,5,7};
        System.out.println(Arrays.toString(deckRevealedIncreasing(deck)));
    }
}

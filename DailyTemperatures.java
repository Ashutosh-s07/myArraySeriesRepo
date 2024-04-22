import java.util.*;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        int nge[]=new int[temperatures.length];
        Stack<Integer>st=new Stack<>();
        for(int i=temperatures.length-1;i>=0;i--){
            System.out.println(st);
            while(!st.empty() && temperatures[st.peek()]<=temperatures[i])   st.pop();
            nge[i]=(st.size()==0)?0:st.peek()-i;
            st.push(i);
        }
        return nge;
    }
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}

import java.util.Arrays;

public class FindtheTownJudge {
    public static int findJudge(int n, int[][] trust) {
        int[] townJudge = new int[n];
        for( int i=1;i<trust.length;i++){
            townJudge[trust[i-1][1]]++;
        }
        System.out.println(Arrays.toString(townJudge));
        return 0;
    }
    public static void main(String[] args) {
        // int[][] trust = {{1,3},{2,3},{3,1}};
        int[][] trust = {{1,2}};
        int n = 2;
        System.out.println(findJudge(n,trust));    
    }
}

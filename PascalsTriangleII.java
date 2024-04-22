import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> row , pre = null;

        for( int i=0;i<=rowIndex;i++){
            row = new ArrayList<>();
            for( int j=0;j<=i;j++){
                if( j==0 || j==i ) row.add(1);
                else row.add(pre.get(j-1)+pre.get(j));
            }
            if( i==rowIndex ) return row;
            pre = row;
            list.add(row);
        }
        return list.get(rowIndex);
    }
    public static void main(String[] args) {
        int rowIndex = 3;
        System.out.println(getRow(rowIndex));
    }
}

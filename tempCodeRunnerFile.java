List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> row , pre = null;

        for( int i=0;i<rowIndex;i++){
            row = new ArrayList<>();
            for( int j=0;j<=i;j++){
                if( j==0 || j==i ) row.add(1);
                else row.add(pre.get(j-1)+pre.get(j));
            }
            if( i==rowIndex-1 ) return row;
            pre = row;
            list.add(row);
        }
        return list.get(rowIndex-1);
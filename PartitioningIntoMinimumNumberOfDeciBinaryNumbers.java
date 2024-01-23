public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public static int minPartitions(String n) {
        int result =n.charAt(0)-'0';
        if( n.length() == 1 ) return (n.charAt(0)-'0');
        for( int i=0;i<n.length();i++){
            if( result < n.charAt(i)-'0') result = n.charAt(i)-'0';
        } 
        return result;
    }
    public static void main(String[] args) {
        String n = "8";
        System.out.println(minPartitions(n));
    
    }
}

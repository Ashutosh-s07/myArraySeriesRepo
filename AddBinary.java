public class AddBinary {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length();
        int j = b.length();
        int sum = 0, carry = 0;
        while (i>=0 && j>=0) {
            carry = sum;
            if( i>=0 ) {
                sum += a.charAt(i)-'0';
                i--;
            }
            if( j>=0 ) {
                sum += b.charAt(i)-'0';
                j--;
            }
            carry = sum>1?1:0;
            sb.append(sum%2);
        }
        if( carry != 0 ) sb.append(carry);
        return sb.reverse().toString();

    }
    public static void main(String[] args) {
        String a = "1010", b = "1011";
        System.out.println(addBinary(a,b));
    }
}

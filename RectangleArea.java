public class RectangleArea {
    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int len1 = Math.abs(bx1-(-ax1));        
        int len2 = Math.abs(bx2-ax2);
        int len = Math.max

        int bre1 = Math.abs(ay1-(-by1));        
        int bre2 = Math.abs(by2-ay2);
        int bre = Math.abs(bre1-bre2);
        System.out.println(len);
        System.out.println(bre);
        return len*bre;
    }
    public static void main(String[] args) {
        int ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2;
        System.out.println(computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2));

    }
}

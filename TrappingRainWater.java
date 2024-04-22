public class TrappingRainWater {
    public int trap(int[] height) {
        int res=0;
        int n = height.length;
        int[] premax = new int [height.length];
        int[] sufmax = new int [height.length];
        int pmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for( int i=0;i<height.length;i++){
            pmax = Math.max(pmax,height[i]);
            smax = Math.max(smax, height[n-i-1]);
        }
        for(int i=0;i<height.length;i++){
            res += (Math.min(sufmax[i],premax[i]) - height[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}

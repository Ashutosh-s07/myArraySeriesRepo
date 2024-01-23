import java.util.Arrays;

public class ContainerWithMostWater {
    public static void maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right){
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;
            max = Math.max(max, area);
            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] height = {1,9,6,2,5,4,8,3,7};
        // System.out.println(maxArea(height));
        maxArea(height);
        // System.out.println(findMax_Ind(0, height));
    }
}

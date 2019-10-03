package question01;

public class WaterInContainer {

    private static int maxArea(int height[])
    {
        int left = 0;
        int right = height.length -1;
        int area = 0;
        while (left < right)
        {
            area = Math.max(area,Math.min(height[left], height[right]) * (right - left));

            if (height[left] < height[right]){
                left+=1;
            }
            else {
                right-= 1;
            }
        }
        return area;
    }

    public static void main(String[] args)
    {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.print( maxArea(height));
    }
}

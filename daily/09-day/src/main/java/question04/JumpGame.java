package question04;

public class JumpGame {

    public static boolean canJump(int nums[])
    {
        if (nums.length <= 1)
            return true;
        if (nums[0] == 0)
            return false;
        int maxReach = nums[0];
        int step = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            if (i == nums.length - 1)
                return true;
            maxReach = Math.max(maxReach, i+nums[i]);
            step--;
            if (step == 0)
            {
                if(i>=maxReach)
                    return false;
                step = maxReach - i;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int nums[] = new int[] {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}

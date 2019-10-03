package question02;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        TreeSet<String> tempSet = new TreeSet<>();
        List<Integer> triplet = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    String str = nums[i] + ":" + nums[j] + ":" + nums[k];
                    if (!tempSet.contains(str)) {
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        result.add(triplet);
                        triplet = new ArrayList<>();
                        tempSet.add(str);
                    }
                    j++;
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0)
                    j++;
                else
                    k--;
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] nums = { -1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);
            System.out.println(result);
    }
}

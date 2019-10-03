package question03;

public class SearchRotated {

    static int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }

     private static int binarySearch(int[] nums, int left, int right, int target){
        if(left>right)
            return -1;

        int mid = left + (right-left)/2;

        if(target == nums[mid])
            return mid;

        if(nums[left] <= nums[mid]){
            if(nums[left]<=target && target<nums[mid]){
                return binarySearch(nums,left, mid-1, target);
            }else{
                return  binarySearch(nums, mid+1, right, target);
            }
        }else {
            if(nums[mid]<target&& target<=nums[right]){
                return  binarySearch(nums,mid+1, right, target);
            }else{
                return  binarySearch(nums, left, mid-1, target);
            }
        }
}

    public static void main(String[] args) {
        int [] nums=new int[]{4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }
}

/* 
    // Leetcode 153. Find Minimum in Rotated Sorted Array
    Or u can say Question : Find how many times a sorted array is rotated
    return the postion of the minimum element in the array.
*/


public class Q3 {

    public int findMin(int[] nums) {
        int len = nums.length;
        int l = 0, r = len - 1,mid=0;
        int min = Integer.MAX_VALUE;

        while (l <= r) {
            if (nums[l] <= nums[r]) {
                min = Math.min(min, nums[l]);
                break;
            }

             mid = l + (r - l) / 2;
            /*Because if the rotation exists, the actual minimum cannot be inside 
            this sorted part except at nums[l], which we've already considered.*/
            if (nums[mid] >= nums[l]) {
            min = Math.min(min, nums[l]);
                l = mid + 1;
            } else {
            min = Math.min(min, nums[mid]);
                r = mid;
            }
        }

        return min;
    }
    public static void main(String[] args) {
        Q3 q3 = new Q3();
        int[] nums = {4,5,6,7,-1,1,2};
        System.out.println(q3.findMin(nums));
    }
}

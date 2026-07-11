/*
Leetcode 35. Search Insert Position


Given a sorted array of distinct integers and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104


*/

public class Q4 {

    public int searchInsert(int[] nums, int target) {
         int low = 0, high = nums.length - 1;
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid]==target) return mid;

            if (nums[mid] > target) {
                if(mid==0)return mid;
                ans = mid;
                high = mid - 1;
            } else {
                if(mid==nums.length-1)return mid+1;
                low = mid + 1; 
            }
        }
       // if(ans==0)return nums.length;
        return ans;
    }
    public static void main(String[] args) {
        Q4 q4 = new Q4();
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(q4.searchInsert(nums, target));
    }
    

}

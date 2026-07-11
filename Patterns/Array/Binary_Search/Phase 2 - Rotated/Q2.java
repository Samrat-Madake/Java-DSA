/*
leetcode 81. Search in Rotated Sorted Array II

Description:
Array is given rotated at some pivot unknown to you beforehand. (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
you are given a target value to search. If found in the array return its index, otherwise return -1.
You must write an algorithm with O(log n) runtime complexity.

But but there are dupliactes in the array.


*/
public class Q2 {
 /*   
Duplicates can make nums[l], nums[mid], and nums[r] equal,
 making it impossible to know which half is sorted.

You may need to shrink the boundaries (l++, r--), 

leading to a worst-case time complexity of O(n).
*/
public boolean search(int[] nums, int target) {

    int l = 0;
    int mid = -1;
    int r = nums.length - 1;
    while (l <= r) {
        mid = (l + r) / 2;
        if (nums[mid] == target)
            return true;

        if (nums[l] == nums[mid] &&
                nums[mid] == nums[r]) {
            l++;
            r--;
        }

        else if (nums[l] <= nums[mid]) { // left is sorted
            if (nums[l] <= target && target < nums[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        } else {
            // Right is sorted
            if (nums[mid] < target && target <= nums[r]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
    }
    return false;
}
}
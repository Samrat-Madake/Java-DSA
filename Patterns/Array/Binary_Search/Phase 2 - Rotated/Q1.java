
/*
Question : Search in Rotated Sorted Array
leetcode 33. Search in Rotated Sorted Array

Description:
Array is given rotated at some pivot unknown to you beforehand. (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
you are given a target value to search. If found in the array return its index, otherwise return -1.
You must write an algorithm with O(log n) runtime complexity.

*/

/*
Place the 2 pointers i.e. low and high: Initially, we will place the pointers like this: low will point to the first index, and high will point to the last index.
        Calculate the ‘mid’: Now, inside a loop, we will calculate the value of ‘mid’ using the following formula:
        mid = (low+high) // 2 ( ‘//’ refers to integer division)
        Check if arr[mid] == target: If it is, return the index mid.
        Identify the sorted half, check where the target is located, and then eliminate one half accordingly:

        If arr[low] <= arr[mid]: This condition ensures that the left part is sorted.
        If arr[low] <= target && target <= arr[mid]: It signifies that the target is in this sorted half. So, we will eliminate the right half (high = mid-1).
        Otherwise, the target does not exist in the sorted half. So, we will eliminate this left half by doing low = mid+1.
        Otherwise, if the right half is sorted:
        If arr[mid] <= target && target <= arr[high]: It signifies that the target is in this sorted right half. So, we will eliminate the left half (low = mid+1).
        Otherwise, the target does not exist in this sorted half. So, we will eliminate this right half by doing high = mid-1.
        Once, the ‘mid’ points to the target, the index will be returned.
        This process will be inside a loop and the loop will continue until low crosses high. If no index is found, we will return -1.*/

        
public class Q1 {
    

    public int search(int[] nums, int target) {
        /*
        obs  : There are 2 sorted arr
        
        pseudo :
        while(l<=r){
            mid:
            if nums[mid]==target return mid;
        
            if(nums[l]<nums[mid]){
                nums[l] < target < nums[mid]{
                    r = mid-1;
                }
            }
            else  if(nums[mid]<nums[r]){
                nums[mid] < target < nums[r]{
                    l = mid+1;
                }
            }
        }
        */

       
        int l = 0;
        int mid = -1;
        int r = nums.length - 1;
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] == target)
                return mid;

             if  (nums[l] <= nums[mid]) { // left is sorted
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            } 
            else{
          // Right is sorted
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }
        }
        return-1;
}
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(q1.search(nums, target));
    }
}
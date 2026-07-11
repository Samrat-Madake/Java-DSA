
/*
Leetcode 162. Find Peak Element

A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.

 

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
 

Constraints:

1 <= nums.length <= 1000
-231 <= nums[i] <= 231 - 1
nums[i] != nums[i + 1] for all valid i.
*/

/*
No adjacent two numbers are the same
the two end of the arrays are -∞
You can return any peak.

To know how to eliminate the half efficiently, we can clearly notice a striking distinction between the left and right halves of the peak element in the array. The left half of the peak element has an increasing order whereas the right half of the peak element has a decreasing order.

Thus we know that if current element is greater than its left neighbour, we are in the left half and if our current element is greater than its right neighbour then we are in the right half. If we know the half that we are in currently, we can eliminate it to find our peak element.


In addition to the two cases above, we can have two more cases. One, where the current element itself is the peak or where the current element is a common point where a decreasing sequence ends and an increasing sequence begins. In either cases we can eliminate any of the halves, as the other half will also contain a peak element.
*/

public class Q2 {
    
    public int findPeakElement(int[] nums) {
        int len = nums.length, mid = 0;
        int l =  0, r = len -1;

        if(len==1)return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[len-1] > nums[len-2]) return len-1;


        while(l<r){
            mid  = (r+l)/2;

            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1])
            return mid;
            
            if(nums[mid] > nums[mid-1])
            l=mid+1;

            else
            r = mid;


        }
        return 0;
    }

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        int[] nums = {1,2,2,4,-1,-2,5,1};
        System.out.println(nums[q2.findPeakElement(nums)]);
    }
}

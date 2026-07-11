/*
Lower Bound


Given a sorted array of nums and an integer x, write a program to find the lower bound of x.

The lower bound algorithm finds the first and smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. x.

If no such index is found, return the size of the array.



Example 1
Input : nums= [1,2,2,2,2,3,3,4], x = 2
Output:1
Explanation:
Index 1 is the smallest index such that arr[1] >= x.


Example 2
Input : nums= [3,5,8,15,19], x = 9
Output: 3
Explanation:
Index 3 is the smallest index such that arr[3] >= x.

Constraints

  1 <= nums.length <= 105
  -105 < nums[i], x < 105
  nums is sorted in ascending order.

*/

public class Q2 {
    public static void func(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
        int ans = arr.length;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        System.out.println("index :"+ans);
    }
    public static void main(String[] args) {
        // int[] arr = {1,2,2,2,2,3,3,4};
        int[] arr = {3,5,8,15,19};
        int x = 9;
        func(arr, x);
    }
}

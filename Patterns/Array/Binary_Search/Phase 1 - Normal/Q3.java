/*
Upper Bound

Given a sorted array of nums and an integer x, write a program to find the upper bound of x.
The upper bound of x is defined as the smallest index i such that nums[i] > x.
If no such index is found, return the size of the array.


Example 1
Input : n= 4, nums = [1,2,2,3], x = 2
Output:3
Explanation:
Index 3 is the smallest index such that arr[3] > x.

Example 2
Input : n = 5, nums = [3,5,8,15,19], x = 9
Output: 3
Explanation:
Index 3 is the smallest index such that arr[3] > x.

*/

public class Q3 {
    public static void func(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
        int ans = arr.length;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] > x) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        System.out.println("index :"+ans);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int x = 2;
        // int[] arr = {3,5,8,15,19};
        // int x = 9 ;
        func(arr, x);
    }
}

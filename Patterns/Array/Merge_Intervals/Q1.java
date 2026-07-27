/*

Leetcode Problem 56: Merge Intervals


Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
Example 3:

Input: intervals = [[4,7],[1,4]]
Output: [[1,7]]
Explanation: Intervals [1,4] and [4,7] are considered overlapping.
 

Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104

*/
import java.util.ArrayList;
import java.util.Arrays;

public class Q1 {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        ArrayList<int[]> list = new ArrayList<>();

        int[] arr = { intervals[0][0], intervals[0][1] };
        list.add(arr);

        for (int i = 1; i < intervals.length; i++) {
            int[] last = list.get(list.size() - 1);

            if (intervals[i][0] <= last[1])
                last[1] = Math.max(last[1], intervals[i][1]);
            else
                list.add(new int[] { intervals[i][0], intervals[i][1] }); // add new

        }
        // Convert ArrayList<int[]> → int[][]
        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        int[][] ans = merge(arr);

        for (int[] n : ans) {
            System.out.println(Arrays.toString(n));
        }
    }
}

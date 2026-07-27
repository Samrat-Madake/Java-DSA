/*
TUF
Q : Power Set
Given an array of integers nums of unique elements. 
Return all possible subsets (power set) of the array.



Do not include the duplicates in the answer.


Example 1
Input : nums = [1, 2, 3]
Output : [ [ ] , [1] , [2] , [1, 2] , [3] , [1, 3] , [2, 3] , [1, 2 ,3] ]

Example 2
Input : nums = [1, 2]
Output : [ [ ] , [1] , [2] , [1,2] ]

*/

import java.util.*;

public class Q3 {
    public static List<List<Integer>> powerSet(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        func(result, 0, nums, inner);

        return result;

    }

    public static void func(List<List<Integer>> list, int ptr, int[] nums, List<Integer> inner) {
        if (ptr == nums.length) {
            List<Integer> currInner = new ArrayList<>(inner);
            list.add(currInner);
            return;
        }

        // not take
        ptr++;
        func(list, ptr, nums, inner);
        ptr--;

        // take
        inner.add(nums[ptr++]);
        func(list, ptr, nums, inner);
        ptr--;
        
        inner.remove(inner.size() - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> result = powerSet(nums);
        System.out.println(result);
    }
}

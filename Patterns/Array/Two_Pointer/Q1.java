import java.util.*;

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         // Arrays.sort(nums);
//         int l = 0, r = 0;

//         for (l = 0; l < nums.length - 1; l++) {
//             for (r = l + 1; r < nums.length; r++) {
//                 if (nums[l] + nums[r] == target)
//                     return new int[] { l, r };
//             }
//         }

//         return new int[] { 0, 0 };
//     }
// }

class Q1 {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                return new int[] { i, map.get(target - nums[i]) };
            }

            map.put(nums[i], i);
        }

        return new int[] { 0, 0 };
    }
}

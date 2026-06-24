import java.util.*;

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Arrays.sort(nums);
//         List<List<Integer>> list = new ArrayList<>();
//         HashSet<List<Integer>> set = new HashSet<>();

//         int n = nums.length;
//         for (int i = 0; i < n - 2; i++) {
//             int l = i + 1, r = n - 1;
//             while (l < r) {
//                 int sum = nums[i] + nums[l] + nums[r];
//                 if (sum == 0 && set.add(Arrays.asList(nums[i], nums[l], nums[r]))) {
//                     // List<Integer> l1 = new ArrayList<>();
//                     // l1.add(nums[i]);
//                     // l1.add(nums[l]);
//                     // l1.add(nums[r]);
//                     list.add(Arrays.asList(nums[i], nums[l], nums[r]));
//                     r--;
//                     // continue;
//                 }

//                 else if (sum > 0)
//                     r--;
//                 else
//                     l++;
//             }
//         }
//         return list;
//     }
// }

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        // HashSet<List<Integer>> set = new HashSet<>();

        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    while (nums[l] == nums[l - 1] && l < r)l++;
                }

                else if (sum > 0) r--;
                else l++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        ThreeSum obj = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(obj.threeSum(nums));
}}

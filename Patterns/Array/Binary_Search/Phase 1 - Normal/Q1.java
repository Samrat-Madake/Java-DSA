class Q1 {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

            int mid = (l + r) / 2;
        while (l <=r) {

                mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            else if (target > nums[mid]) {
                l = mid + 1;
            } else if (target < nums[mid]) {
                r = mid - 1;
            }

        }

        return -1;

    }
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(q1.search(nums, target));
    }
}
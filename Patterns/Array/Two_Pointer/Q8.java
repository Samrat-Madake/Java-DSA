public class Q8 {

    public void sortColors(int[] nums) {
        int l=0,r=nums.length-1;

        // move l to first non-zero
        // move r to last non-two
        while(l<=r && nums[l]==0)l++;
        while(r>=l && nums[r]==2)r--;


        int i=l;
        while(i<=r){
            if(nums[i]==0){
                //swap with l
                int temp = nums[l];
                nums[l] = nums[i];
                nums[i] = temp;

                l++;
            }else if(nums[i]==2){
                // swap with r
                int temp = nums[r];
                nums[r] = nums[i];
                nums[i] = temp;

                r--;
                i--;
                // why i--? because we need to check the swapped value at i, 
                // it could be 0 or 2, so we need to check it again
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Q8 obj = new Q8();
        int[] nums = {0,0,0,1,0,2,1,1,1,0,2,0,2,1,1,0};
        obj.sortColors(nums);
        for(int i: nums){
            System.out.print(i + " ");
        }
    }
}
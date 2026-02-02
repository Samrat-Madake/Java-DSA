import java.util.ArrayList;

/*Monotonic ArrayList (EASY)
An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j).
 An Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).

Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
Sample Input 1: nums = [1,2,2,3]
Sample Output 1: true
Sample Input 2: nums = [6,5,4,4]
Sample Output 2: true
Sample Input 3: nums = [1,3,2]
Sample Output 3: : false */
public class Monotonic_incr {

    public static boolean monotonic_incr_dec(ArrayList<Integer> list) {

        int count1=0;
        int count2=0;
        int n = list.size();
        for (int i = 0; i < list.size()-1; i++) {

            if (list.get(i) <= list.get(i + 1)) {
                count1++;
               
            } 
            if (list.get(i) >=list.get(i + 1)) {
                count2++;
            }
        }
        if (count1==n-1) {
            return true;
        }
        if (count2==n-1) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(4);

        System.out.println(monotonic_incr_dec(list));

    }

}

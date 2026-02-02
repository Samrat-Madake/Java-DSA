/*Question 2:
Lonely Numbers in ArrayList (MEDIUM)
You are given an integer arraylist nums.

 A number x is lonely when it appears only once, and no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
Return all lonely numbers in nums. You may return the answer in any order.

Sample Input 1: nums = [10,6,5,8]
Sample Output 1: [10,8]

Explanation:
10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
 5 is not a lonely number since 6 appears in nums and vice versa. 
Hence, the lonely numbers in nums are [10, 8]. Note that [8, 10] may also be returned.*/

import java.util.ArrayList;

public class Q2 {

    public static void lonely_no(ArrayList<Integer> list) {

        ArrayList<Integer> new_list = new ArrayList<>();

         // For 1st element
         int n1 = list.get(0) - 1;
         int n2 = list.get(0) + 1;

         if (list.get( 1) != n1 && list.get( 1) != n2) {
            new_list.add(list.get(0));
        }
        // For last st element
         n1 = list.get(list.size()-1) - 1;
         n2 = list.get(list.size()-1) + 1;

        if (list.get(list.size()-2) != n1 && list.get(list.size()-2) != n2) {
            new_list.add(list.get(list.size()-1));
        }

        

        for (int i = 1; i < list.size() - 1; i++) {

             n1 = list.get(i) - 1;
             n2 = list.get(i) + 1;

           
            if (list.get(i - 1) != n1 && list.get(i - 1) != n2 && list.get(i + 1) != n1 && list.get(i + 1) != n2) {

                new_list.add(list.get(i));

            }

        }
        

        System.out.println(new_list);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);

        lonely_no(list);
    }

}

public class Arrays {
    // FINDING DUPLICATE ELEMENT IN AN ARRAY;

    public static void Buy_Sell_Stocks(int nums[]) {
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < nums.length; i++) {

            if (buy_price < nums[i]) {
                int profit = nums[i] - buy_price;
                max_profit = Math.max(max_profit, profit);
            } else {
                buy_price = nums[i];
            }
        }

        System.out.println("Max profit = " + max_profit);

    }

    public static void Duplicate_element_in_array(int nums[])
       {
        boolean x = false;
        for (int i = 0; i < nums.length; i++) {
  
          for (int j = i+1; j < nums.length; j++) {
              if (nums[i]==nums[j]) {
                  x=true;  
              }
          }
        }
  
        System.out.println(x);
       }


       public static void triplet(int nums[])
       {
          

       }

    public static void main(String[] args) {

        int nums[] = { 4, 2, 3, 1, 5, 9 };
        

        Buy_Sell_Stocks(nums);

    }

}

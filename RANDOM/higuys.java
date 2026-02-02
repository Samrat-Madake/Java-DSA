import java.util.*;

public class higuys {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    /////////////////////////////////////////////// // LARGEST IN AN ARRAY
    System.out.print("ENter the size of array :");
    int n = sc.nextInt();
    int list[] = new int[n];

    for (int i = 0; i < list.length; i++) {
      list[i] = sc.nextInt();
    }
    for (int i = 0; i < list.length; i++) {
      System.out.print(list[i] + " ");
    }
    System.out.println("\n");
    // largest_in_array(list);
    // reverse_array(list);
    // pair_in_array(list);
    SubArray_in_an_array(list);



    sc.close();
  }

  public static void largest_smallest_in_array(int arr[]) {
    int largest = Integer.MIN_VALUE;
    int Smallest = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
      if (arr[i] < Smallest) {
        Smallest = arr[i];
      }
    }
    System.out.println("Biggest element = " + largest);
    System.out.println("Smallest element = " + Smallest);

  }

  public static void pair_in_array(int arr[]) {
    for (int i = 0; i < arr.length; i++) {

      for (int j = i + 1; j < arr.length; j++) {
        System.out.print("(" + arr[i] + arr[j] + ")" + " ");

      }
      System.out.println();
    }
  }

  public static void SubArray_in_an_array(int arr[]) {
    int n = arr.length;
    int total_sum_array[] = new int[(n * (n + 1) / 2)];
    int counter = 0;
    for (int i = 0; i < arr.length; i++) {

      for (int m = i; m < arr.length; m++) {
        int sum = 0;

        for (int j = i; j <= m; j++) {
          System.out.print(arr[j] + " ");
          sum = sum + arr[j];
        }
        
        System.out.print("  (Total = " + sum + ")");
        total_sum_array[counter] = sum;
        counter++;
        System.out.println();
      }
      System.out.println();
    }

    System.out.println("Array of Sums ");
    for (int i = 0; i < (n * (n + 1) / 2); i++) {
      System.out.print(total_sum_array[i] + " ");
    }
    System.out.println("\n");
    largest_smallest_in_array(total_sum_array);



     
  }

}

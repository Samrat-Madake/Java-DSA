import java.util.Scanner;

public class Recursion {

    public static void dec(int n) {

        if (n == 1) {
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");
        dec(n - 1);

    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);

    }

    public static int sum_of_n(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sum_of_n(n - 1);

    }

    public static void fibonacci_itterative(int n) {
        int t1 = 0, t2 = 1, tn = 0;
        System.out.print(0 + " ");

        for (int i = 1; i < n; i++) {

            tn = t1 + t2;
            System.out.print(tn + " ");
            t1 = t2;
            t2 = tn;
        }
    }

    public static int fib_recurs(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return (fib_recurs(n - 1) + fib_recurs(n - 2));

    }

    public static boolean check_array_sorted_recursive(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return (check_array_sorted_recursive(arr, i + 1));

    }

    public static boolean check_array_sorted_ittertive() {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        boolean x = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                x = false;
            }
        }

        return x;

    }

    public static int Tiling_Problem(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = Tiling_Problem(n - 1);
        int fnm2 = Tiling_Problem(n - 2);

        return fnm1 + fnm2;
    }

    public static void Duplicate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String Str1 = sc.nextLine();

        StringBuilder Str2 = new StringBuilder("");

        for (int i = 0; i < Str1.length(); i++) {
            char c = Str1.charAt(i);
            boolean x = false;

            for (int j = 0; j < Str2.length(); j++) {

                if (Str2.charAt(j) == c) {
                    x = true;
                    break;
                }
            }
            if (x == false) {
                Str2.append(Str1.charAt(i));
            }
        }
        System.out.print(Str2);
    }

    public static void Duplicate_old() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String Str1 = sc.nextLine();

        StringBuilder Str2 = new StringBuilder("");
        System.out.print(Str1.charAt(0));
        for (int i = 1; i < Str1.length(); i++) {
            boolean x = false;
            for (int j = i - 1; j >= 0; j--) {
                if (Str1.charAt(i) != Str1.charAt(j)) {
                    x = true;
                } else if (Str1.charAt(i) == Str1.charAt(j)) {
                    x = false;
                    break;
                }
            }
            if (x == true) {
                Str2.append(Str1.charAt(i));
            }

        }
        System.out.print(Str2);

    }

    public static void Bianry_String(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);

            return;
        }
        Bianry_String(n - 1, 0, str + "0");
        if (lastplace == 0) {
            Bianry_String(n - 1, 1, str + "1");
        }

    }

    public static void Occurence_in_Array(int i, int arr[], int newarr[], int key) {
        if (i == arr.length) {
            for (int j = 0; j < newarr.length; j++) {
                System.out.print(newarr[j] + " ");
            }
            return;
        }

        if (arr[i] == key) {
            newarr[i] = i;

        }
        Occurence_in_Array(i + 1, arr, newarr, key);
    }

    public static void Number_to_string(int i, String str, String arr[]) {
        if (i == str.length()) {
            return;
        }
        // System.out.print(arr[ Character.getNumericValue(str.charAt(i))] + " ");
        System.out.print(arr[(str.charAt(i) - '0')] + " ");
        Number_to_string(i + 1, str, arr);

    }

    public static void length_of_String(int i, String str)
    {
        if (i==str.length()) {
            System.err.println("Length of String = "+ i );
            return;
        }

        length_of_String(i+1, str);
    }



    public static void main(String[] args) {

        // int n = 6;
        // int arr[] = { 1, 2, 3, 2, 4,5,2,4,2 };
        // int newarr[]=new int[arr.length];

        // dec(n);
        // System.out.println();
        // System.out.println(fact(n));
        // System.out.println(sum_of_n(n));
        // fibonacci_itterative(n);
        // System.out.println(fib_recurs(n));
        // System.out.println(check_array_sorted_ittertive());
        // System.out.println(check_array_sorted_recursive(arr,0));
        // System.out.println(Tiling_Problem(5));
        // Duplicate_old();
        // Bianry_String(3, 0, "");
        // Occurence_in_Array(0, arr, newarr, 2);
        length_of_String(0, "samrat_A_Madake");

    //    {  //Number_to_string
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the no");

    //     String no = "";

    //     int i = 0;
    //     while (i == 0) {
    //         i = 1;
    //         no = sc.nextLine();
    //         int no1 = Integer.parseInt(no);
    //         if (no1 % 10 == 0) {
    //             System.out.println("Enter another no ");
    //             i = 0;
    //         }
    //     }
    //     String arr[] = { "Zero", "One", "Two", "Three", "four", "Five", "Six", "Seven", "Eight", "Nine" };
    //     Number_to_string(0, no, arr);

    //    }

    
}

}
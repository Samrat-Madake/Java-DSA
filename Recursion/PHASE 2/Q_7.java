// 7. Reverse array recursively

public class Q_7 {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        rev(arr, 0);
        for (int n : arr)System.out.print(n + " ");

    }

    public static void rev(int[] arr, int ptr) {
        if (ptr == arr.length / 2)
            return;

        int temp = arr[arr.length - 1 - ptr];
        arr[arr.length - 1 - ptr] = arr[ptr];
        arr[ptr] = temp;

        rev(arr, ptr + 1);
    }
}

/*
 * 0 1 2 3 4
 * [10,20,30,40,50]
 * 
 * len-1+curr :
 * 
 * 0-4 : 5-1-0 : 4
 * 1-3 : 5-1-1 : 3
 * 2-2 : 5-1-2 : 2
 * 
 */
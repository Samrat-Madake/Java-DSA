// 6. Check if array is sorted

public class Q_6 {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[] arr = { 1, 2, 3, 4, 8, 9 };

        if (checkSorted(arr, 0))
            System.out.print("Sorted");
        else
            System.out.print("Not Sorted");
    }

    public static boolean checkSorted(int[] arr, int ptr) {
        if (ptr == arr.length)
            return true;

        if (ptr + 1 < arr.length && arr[ptr] > arr[ptr + 1])
            return false;

        return checkSorted(arr, ptr + 1);
    }
}
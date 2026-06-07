// 1. Find maximum element

public class Q_1 {
    public static void main(String[] args) {
        System.out.println("Hello");

        int[] arr = { 1, 234, 45, 12, 123, 5676, 234, 123, 969883 };
        int max = findMax(arr, 0);

        System.out.print("Max : " + max);
    }

    public static int findMax(int[] arr, int ptr) {
        if (ptr == arr.length-1)
            return arr[ptr];

        return Math.max(arr[ptr] ,findMax(arr, ptr+1));
    }
}
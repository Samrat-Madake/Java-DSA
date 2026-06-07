// 2. Find Minimum element

public class Q_2 {
    public static void main(String[] args) {
        System.out.println("Hello");

        int[] arr = { 1, 234, 45, 12, 123, 5676, 234, 123, 969883,-1 };
        int Min = findMin(arr, 0);

        System.out.print("Min : " + Min);
    }

    public static int findMin(int[] arr, int ptr) {
        if (ptr == arr.length-1)
            return arr[ptr];

        return Math.min(arr[ptr] ,findMin(arr, ptr+1));
    }
}
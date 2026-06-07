// 3. Sum of array elements


public class Q_3 {
    public static void main(String[] args) {
        System.out.println("Hello");

        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = findSum(arr, 0);

        System.out.print("Sum : " + sum);
    }

    public static int findSum(int[] arr, int idx) {
        if (idx == arr.length)
            return 0;

        return arr[idx] + findSum(arr, idx + 1);
    }
}
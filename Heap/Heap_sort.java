public class Heap_sort {

    public static void heap_Sort(int arr[]) {

        // Step 1 : Build Max Heap

        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // Step 2 : Swap largest to smallest then heapify
        // Swap
        for (int i = n - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }

    }

    public static void heapify(int arr[], int i, int size) {

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int maxInd = i;

        if (left < size && arr[left] > arr[maxInd]) {
            maxInd = left;
        }
        if (right < size && arr[right] > arr[maxInd]) {
            maxInd = right;
        }

        if (maxInd != i) {

            // Swap
            int temp = arr[maxInd];
            arr[maxInd] = arr[i];
            arr[i] = temp;

            heapify(arr, maxInd, size);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 6, 1, 2, 4, 5, 3 };
        heap_Sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}

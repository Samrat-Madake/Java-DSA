// find all occurence of target 

public class Q_5 {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[] arr = { 1, 2, 3, 4, 8, 9, 4 };
        int key = 4;

        find(arr, 0, key);

    }

    public static void find(int[] arr, int ptr, int key) {
        if (ptr == arr.length)
            return;
        if (arr[ptr] == key)
            System.out.print(ptr + " ");

        find(arr, ptr + 1, key);
    }
}
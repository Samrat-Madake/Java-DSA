// Linear Search 

public class Q_4 {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[] arr = { 1, 2, 3, 4, 5 };
        int key = 4;

        if (find(arr, 0, key))
            System.out.println("Found");
        else
            System.out.println("Not Found");

    }

    public static boolean find(int[] arr, int ptr, int key) {
        if (ptr == arr.length)
            return false;

        return arr[ptr]==key || find(arr, ptr + 1, key);
    }
}
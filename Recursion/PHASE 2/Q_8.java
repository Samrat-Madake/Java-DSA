// 8. Binary search recursively

// Iteratively 


// public class Q_8 {
//     public static void main(String[] args) {
//         System.out.println("Hello");
//         int[] arr = { 1,2,3,4,5,6,7};

//         bs(arr,7);

//     }

//     public static void bs(int[] arr, int key) {
//         int l = 0, r = arr.length -1 ;
//         while(l<=r){
//             int mid = l + (r-l)/2;

//             if(arr[mid]==key){
//                 System.out.print("Found "+ key +" at index : "+ mid);
//                 return;
//             }

//             if(arr[mid] > key)r = mid - 1;
//             else l = mid + 1;
//         }
//     }
// }


// Recursivly 
public class Q_8 {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int key = 7;

        bs(arr, key, 0, arr.length - 1);

    }

    public static void bs(int[] arr, int key, int l, int r) {
        // base
        if (l > r)return;

        int mid = l + (r - l) / 2;

        if (arr[mid] == key) {
            System.out.print("Found " + key + " at index : " + mid);
            return;
        }

        if (arr[mid] > key)bs(arr, key, l, mid - 1);
        else bs(arr, key, mid + 1, r);

    }
}

public class sort {

    public static int Count_in_range(int arr[], int si, int ei, int num) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static int Majority_element_rec(int arr[], int si, int ei) {

        if (si == ei) {
            return arr[si];
        }

        int mid = si + (ei - si) / 2;

        int left = Majority_element_rec(arr, si, mid);
        int right = Majority_element_rec(arr, mid + 1, ei);

        if (left == right) {
            return left;
        }

        int leftcount = Count_in_range(arr, si, ei, left);
        int rightcount = Count_in_range(arr, si, ei, right);

        return leftcount > rightcount ? left : right;

    }

    public static void Merge_sort_String(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid;
        mid = (si + ei) / 2;

        Merge_sort_String(arr, si, mid);// left side array
        Merge_sort_String(arr, mid + 1, ei); // right side array

        merge_String(arr, si, mid, ei);

    }

    public static void merge_String(String arr[], int si, int mid, int ei) {

        int i = si;
        int j = mid + 1;
        int k = 0;
        String temp[] = new String[ei - si + 1];

        while (i <= mid && j <= ei) {

            int v = arr[i].compareTo(arr[j]);

            if (v < 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {

            arr[i] = temp[k];
        }
    }

    public static void Merge_sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid;
        mid = (si + ei) / 2;

        Merge_sort(arr, si, mid);// left side array
        Merge_sort(arr, mid + 1, ei); // right side array

        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {

        int i = si;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[ei - si + 1];

        while (i <= mid && j <= ei) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {

            arr[i] = temp[k];
        }
    }

    public static void Quik_sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int Idx = partion(arr, si, ei);
        Quik_sort(arr, si, Idx - 1); // For Left Part
        Quik_sort(arr, Idx + 1, ei); // For Right Part

    }

    public static int partion(int arr[], int si, int ei) {

        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++; // SWAP
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // For Swap of Pivot element

        i++;
        int temp1 = pivot;
        arr[ei] = arr[i];
        arr[i] = temp1;

        return i;
    }

    public static int Search_in_Rotated_Array(int arr[], int si, int ei, int tar) {
        if (si > ei) {
            return -1;
        }
        int mid = (si + ei) / 2;
        if (arr[mid] == tar) {
            return mid;
        }

        // Case 1
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar <= arr[mid]) {
                return Search_in_Rotated_Array(arr, si, mid - 1, tar); // Case a
            } else {
                return Search_in_Rotated_Array(arr, mid + 1, ei, tar); // Case b
            }
        }
        // Case 2
        else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return Search_in_Rotated_Array(arr, mid + 1, ei, tar); // Case a
            } else {
                return Search_in_Rotated_Array(arr, si, mid - 1, tar); // Case b
            }

        }

    }

    public static void Print_array(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        //# Merge sort Quik sort #//
        // int arr[] = { 6, 3, 9, -2, 5, 2, 8, 10, 133, 21 };
        // int ei = arr.length - 1;
        // Merge_sort(arr, 0, ei);
        // Quik_sort(arr, 0, ei);
        // Print_array(arr);

        //# Search_in_Rotated_Array #//
        // int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        // int ei = arr.length - 1;
        // Print_array(arr);
        // int index = Search_in_Rotated_Array(arr, 0, ei, 0);
        // System.out.println("Target founf at index = " + index);

         //# Merge_sort_String  #//
        // String arr[]= {"sun", "earth", "mars", "mercury"};
        String arr[] = {"muskmelon", "melon", "berry", "curstardapple", "watermelon", "chickoo", "bannana", "orange", "apple" };
        Merge_sort_String(arr, 0, arr.length - 1);
        Print_array(arr);



        // //# Majority element in array #//
        // int arr[]={1,2,2,4,4,5,6,2,2,4,5,6,7,2,2,2,5};
        // int result=Majority_element_rec(arr, 0, arr.length-1);
        // System.out.println(result);
    }

}

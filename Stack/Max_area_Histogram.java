import java.util.Stack;

public class Max_area_Histogram {


    public static void Max_area(int arr[], Stack<Integer> s){
        int nsl[]=new int[arr.length];
        int nsr[]=new int[arr.length];

        //Next smaller left
       nsl= next_smaller_left(arr, s);

        //Next Smaller right 
        nsr=next_smaller_right(arr, s);

        int max_area=0;
        //Area
        for (int i = 0; i < nsr.length; i++) {

            int curr=arr[i]*(nsr[i]-nsl[i]-1);
            if (curr>=max_area) {
                max_area=curr;
                
            }
            
        }

        System.out.println("MAX AREA = "+ max_area);

    }

    public static int[] next_smaller_right(int arr[], Stack<Integer> s) {
        int next_greator[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                next_greator[i] = arr.length;
            } else {
                next_greator[i] = s.peek();
            }

            s.push(i);
        }

        return next_greator;
        
    }

    public static int[] next_smaller_left(int arr[], Stack<Integer> s) {
        int next_smaller[] = new int[arr.length];
        s=new Stack<>();

        for (int i = 0; i <= arr.length - 1; i++) {

            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                next_smaller[i] = -1;
            } else {
                next_smaller[i] = s.peek();
            }

            s.push(i);
        }

        return next_smaller;
        

    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        int arr[] = { 2, 1, 5, 6, 2, 3 };

        Max_area(arr, s);
       
    }

}

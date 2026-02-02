import java.util.Stack;

public class Using_JCF {

    public static void push_bt(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int x = s.pop();
        push_bt(s, data);

        s.push(x);
    }

    public static void reverse_stack(Stack<Integer> s) {

        if (s.isEmpty()) {
            return;
        }

        int top=s.pop();
        reverse_stack(s);
        push_bt(s, top);
    }

    public static void print_stack(Stack<Integer> s)
    {
        if (s.isEmpty()) {
            return;
        }
        int top= s.pop();
        System.out.println(top);
        print_stack(s);
        s.push(top);

    }

    public static void next_greator(int arr[],Stack<Integer>s){
        int next_greator[]=new int[arr.length];


        for (int i = arr.length-1; i >=0; i--) {

            while (!s.isEmpty() && s.peek()<=arr[i] ) {
                s.pop();
            }
            
            if (s.isEmpty()) {
                next_greator[i]=-1;                
            }else{
                next_greator[i]=s.peek();
            }

            s.push(arr[i]);
        }
        for (int i = 0; i < next_greator.length; i++) {
            System.out.print(arr[i]+ " ");  
        }System.out.println();
        for (int i = 0; i < next_greator.length; i++) {
            System.out.print(next_greator[i]+ " ");  
        }




    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
    //     s.push(1);
    //     s.push(2);
    //     s.push(3);
    //     s.push(4);


    //     push_bt(s, 10);
    //     push_bt(s, 20);
    //     s.isEmpty();

        
    //     print_stack(s);
    //    reverse_stack(s);
    //     print_stack(s);

    int arr[]={6,8,0,1,3};

    next_greator(arr, s);

    }

}

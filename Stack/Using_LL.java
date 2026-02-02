import java.util.LinkedList;

public class Using_LL {


    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;

     public static class Stack {
        static LinkedList<Integer> ll = new LinkedList<>();

        // Is empty
        public boolean is_empty() {
            return head==null;
        }

        // Pop
        public int pop() {

            if (is_empty()) {
                return -1;
            }
            int top = head.data;
            head=head.next;
            return top;
        }

        // peek
        public void peek() {
            
            if (is_empty()) {
                System.out.println("Stack is Empty NIGGA");
            }
            int top = head.data;
            System.out.println(top);
        }

        // push
        public void push(int data) {
            Node newNode = new Node(data);

            newNode.next=head;
            head=newNode;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.is_empty()) {
            s.peek();
            s.pop();

        }
        s.push(10);
        s.peek();
        s.pop();
        

    }

}
    


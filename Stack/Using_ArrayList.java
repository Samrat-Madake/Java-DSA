import java.util.*;

public class Using_ArrayList {

    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // Is empty
        public boolean is_empty() {
            return list.size() == 0;
        }

        // Pop
        public int pop() {

            if (is_empty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public void peek() {
            
            if (is_empty()) {
                System.out.println("Stack is Empty NIGGA");
            }
            int top = list.get(list.size() - 1);
            System.out.println(top);
        }

        // push
        public void push(int data) {
            list.add(data);
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
        s.peek();

    }

}
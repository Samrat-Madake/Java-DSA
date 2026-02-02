import java.util.*;

public class Palindrome_in_LL_2 {

    public static class Node {

        int data;
        Node next = null;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static boolean is_Palindrome(Node head) {
        Node temp = head;

        Stack<Integer> s = new Stack<>();

        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }

        while (head != null) {

            if (head.data != s.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(3);
        Node five = new Node(2);
        Node six = new Node(1);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;

        System.out.println(is_Palindrome(one));

    }

}

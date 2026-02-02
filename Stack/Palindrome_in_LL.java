import java.util.*;

public class Palindrome_in_LL {

    public static boolean ll_is_palindrome(LinkedList<Character> ll ) {
        Stack<Character> s1 =new Stack<>();
        Stack<Character> s11 =new Stack<>();
        Stack<Character> s2 =new Stack<>();

        for (int i = 0; i < ll.size(); i++) {
            s1.push(ll.get(i));
            s11.push(ll.get(i));
        }
        for (int i = 0; i < ll.size(); i++) {

            s2.push(s11.pop());
            
        }
        for (int i = 0; i < ll.size(); i++) {
            if (s1.pop()!=s2.pop()) {
                return  false;
                
            }
            
        }

        return  true;

        
    }



    public static void main(String[] args) {

        LinkedList<Character> ll =new LinkedList<>();
        ll.addLast('A');
        ll.addLast('B');
        ll.addLast('C');
        ll.addLast('B');
        ll.addLast('A');
       // ll.addLast('M');
        System.out.println(ll);

        System.out.println(ll_is_palindrome(ll));

        
    }
    
}

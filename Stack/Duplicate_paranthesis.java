import java.util.*;

public class Duplicate_paranthesis {

    public static boolean duplicate(Stack<Character> s, String str) {

        for (int i = 0; i < str.length() ; i++) {
            char curr = str.charAt(i);

            if (curr != ')') {
                s.push(curr);
            }

            else {
                int count = 0;
                while (s.pop() != '(' ) {
                    count++;
                }
                if (count < 1) {
                    return true; // Duplicate hai
                }
            }
        }

        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();

        System.out.println("Enter a String of paranthesis : ");
        String str = sc.nextLine();

     
        
        System.out.println(duplicate(s, str));
       

    }

}

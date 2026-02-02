import java.util.*;

public class Valid_paranthesis {

    public static boolean pair(char c, Stack<Character> s) {
        if (c == ']' && s.peek() == '[') {
            return true;
        } else if (c == '}' && s.peek() == '{') {
            return true;
        } else if (c == ')' && s.peek() == '(') {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();

        System.out.println("Enter a String of paranthesis : ");
        String str = sc.nextLine();

        boolean result = true;

        for (int i = 0; i < str.length() - 1; i++) {
                char curr=str.charAt(i);
            if (curr == '{' || curr == '[' || curr == '(' ) {
                s.push(curr);
            }
            // else it will be closing
            else {
                if (s.isEmpty()) {
                    result =false; 
                }
               // char curr = str.charAt(i);
                if (pair(curr, s)) {
                    s.pop();
                } else {
                    result = false;
                }
            }

        }

        if (result==true) {
            System.out.println("Valid Paranthesis");
        } else {
            System.out.println("NOT a Valid Paranthesis");
        }

    }

}

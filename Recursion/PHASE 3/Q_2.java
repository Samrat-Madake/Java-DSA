// 1. Reverse string
public class Q_2 {
    public static void main(String[] args) {
        // String s = new String("Helloooo");
        StringBuilder s = new StringBuilder("hih");
        if(rev(s, 0, s.length()-1))
        System.out.print("Palindrome");
        else 
        System.out.print("Not Palindrome");
    }

    public static boolean rev(StringBuilder s, int l, int r) {
        // Base
        if (l > r) {
            return true;
        }
        if (s.charAt(l) != s.charAt(r))
            return false;

        return rev(s, l + 1, r - 1);
    }
}


// 6. Remove duplicate characters
import java.util.HashSet;

public class Q_6 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abbbbaaccffjjsdfka");
        HashSet<Character> set = new HashSet<>();

        String ans = rmDuplicate(s, set, 0);
        System.out.print(ans);

    }

    public static String rmDuplicate(StringBuilder s, HashSet<Character> set, int ptr) {
        // Base
        if (ptr == s.length())
            return "";

        // remove curr
        // if (set.contains(s.charAt(ptr))) {
        //     s.deleteCharAt(ptr);
        //     --ptr;
        // } else {
        //     set.add(s.charAt(ptr));
        // }

        // Recursive
        return (set.contains(s.charAt(ptr) ? "" : s.charAt(ptr))) + rmDuplicate(s, set, ptr + 1);


    }
}

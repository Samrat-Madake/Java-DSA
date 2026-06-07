
// 3. Remove all occurrences of a character
public class Q_3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hiiiih");
        String ans = remove(sb, 0, 'i');

        System.out.print(ans);

    }

    public static String remove(StringBuilder s, int ptr, char key) {
        // Base
        if (ptr == s.length())
            return "";

        // Recursive
        return (s.charAt(ptr) == key ? "" : s.charAt(ptr)) + (remove(s, ptr + 1, key));
    }
}

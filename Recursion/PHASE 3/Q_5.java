// 5. Count vowels
public class Q_5 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hiiAAih");

        System.out.print(count(s, 0));
    }

    public static int count(StringBuilder s, int ptr) {
        // BASE
        if (ptr == s.length())
            return 0;
        // RECURSIVE
        return (vowel(Character.toLowerCase(s.charAt(ptr))) ? 1 : 0) + count(s, ptr + 1);
    }

    public static boolean vowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;

        return false;
    }
}

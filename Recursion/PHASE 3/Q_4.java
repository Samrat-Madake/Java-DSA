// 4. Replace character recursively
public class Q_4 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hiiih");
        char key = 'a';
        StringBuilder ans = replace(s, 0, key, 'i');
        System.out.print(ans);
    }

    public static StringBuilder replace(StringBuilder s, int ptr, char key, char target) {
        // Base
        if (ptr == s.length())
            return s;

        // update curr
        if (s.charAt(ptr) == target) 
            s.setCharAt(ptr, key);
        
        
        // recursive
        return replace(s, ptr + 1, key, target);

    }
}

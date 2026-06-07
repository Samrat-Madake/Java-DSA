// 7. Convert string to integer (atoi)
public class Q_7 {
    public static void main(String[] args) {
        String s = new String("-12344");

        // sign
        int sign = 0; // -1 : nigga ,,, 1 : posi
        if (s.charAt(0) == '-') {
            sign = -1;
            s = s.substring(1,s.length());
        } else
            sign = 1;

        // System.out.println("before : "+ s);
        
        long num = 0;
        long ans = atoi(s, 0, num);
        // System.out.println("ans : "+ ans);
        
        // update sign
        
        if (sign == -1)
            ans = -ans;

        System.out.print(ans);

    }

    public static long atoi(String s, int ptr, long num) {
        // Base
        if (ptr == s.length())
            return num;

        // update
        num = num * 10 + (s.charAt(ptr) - '0');
        // Recursive
        return atoi(s, ptr + 1, num);
    }
}

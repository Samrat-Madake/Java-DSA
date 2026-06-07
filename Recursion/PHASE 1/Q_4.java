// 4. Factorial of N

public class Q_4 {
    public static void main(String[] args) {
        System.out.println("Hello Guys");
        int n = 5;
        int ans = factorial(n);
        System.out.println(ans);
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}

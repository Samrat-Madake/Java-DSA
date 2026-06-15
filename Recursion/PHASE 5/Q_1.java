// 1. Fibonacci Series

import java.util.*;

// 1. Fibonacci Series without Memoization
/*

public class Q_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter nth term");
        int n = sc.nextInt();
        
        fib(n);
        sc.close();
    }
    
    public static int fib(int n) {
        // base
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
*/


// 2. Fibonacci Series with Memoization
public class Q_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter nth term");
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        int ans = fib(n, dp);
        System.out.println(ans);
        sc.close();
    }

    public static int fib(int n, int[] dp) {
        // base
        if (n <= 1) {
            dp[n] = n;
            return n;
        }

        if (dp[n] != 0)
            return dp[n];

        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }
}

/*
 * 0 1 1 2 3 5 8
 * 1 2 3 4 5 6 7
 * 
 */
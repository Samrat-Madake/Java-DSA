/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/


// 1. Normal Recursion
class Q_2 {
    public int climbStairs(int n) {
        if (n <= 1)
            return 1;

        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static void main(String[] args) {
        Q_2 q = new Q_2();
        int n = 4;
        System.out.println(q.climbStairs(n));
    }
}


// 2. Recursion + DP ( Memoization )
// class Q_2 {
//     public int climbStairs(int n) {
//         int[] dp = new int[46]; // 0 - 44
//         rec(n, dp);

//         return dp[n];
//     }

//     public int rec(int n, int[] dp) {
//         if (n <= 1){
//             dp[n]=1;
//             return 1;
//         }

//         if (dp[n] != 0)return dp[n];

//         dp[n] = rec(n - 1, dp) + rec(n - 2, dp);
//         return dp[n];
//     }
//         public static void main(String[] args) {
//         Q_2 q = new Q_2();
//         int n = 4;
//         System.out.println(q.climbStairs(n));
//     }
// }

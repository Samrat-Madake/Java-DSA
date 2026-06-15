
// 5. Friend Pairing Problem
/*

At any point a person has 2 choice 

1. Remain single, in this case the problem reduces to f(n-1) as one person is fixed and we need to find for remaining n-1 persons.

2. Pair up with any of the remaining n-1 persons, in this case the problem reduces to f(n-2) as two persons are fixed and we need to find for remaining n-2 persons. Also, as one person can pair up with any of the remaining n-1 persons, we have (n-1) ways to do so.

*/

// 1 . Normal Recursion
// class Q_4 {
//     public long countFriendsPairings(int n) {
//         if (n <= 2)
//             return n;

//         return countFriendsPairings(n - 1) + (n - 1) * countFriendsPairings(n - 2);

//     }

//     public static void main(String[] args) {
//         Q_4 q = new Q_4();
//         int n = 3;
//         System.out.println(q.countFriendsPairings(n));
//     }
// }



// 2. Recursion + DP ( Memoization )


class Q_4 {

    public long countFriendsPairings(int n) {
        long[] dp = new long[n + 1];
        return func(n, dp);
    }

    public long func(int n, long[] dp) {

        if (n <= 2) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = func(n - 1, dp) + (n - 1) * func(n - 2, dp);

        return dp[n];
    }

    public static void main(String[] args) {
        Q_4 q = new Q_4();
        int n = 3;
        System.out.println(q.countFriendsPairings(n));
    }
}


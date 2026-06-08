
// 5. Friend Pairing Problem
/*

At any point a person has 2 choice 

1. Remain single, in this case the problem reduces to f(n-1) as one person is fixed and we need to find for remaining n-1 persons.

2. Pair up with any of the remaining n-1 persons, in this case the problem reduces to f(n-2) as two persons are fixed and we need to find for remaining n-2 persons. Also, as one person can pair up with any of the remaining n-1 persons, we have (n-1) ways to do so.

*/

class Q_5 {
    public long countFriendsPairings(int n) {
        long[] dp = new long[19];
        return func(n,dp);
    }
    public long func(int n, long[] dp){
                // code here
        if(n<=2){
            dp[n] = n;
            return n;
        }
        
        if(dp[n]!=0)return dp[n];
        
        dp[n] = countFriendsPairings(n-1) + (n-1) * countFriendsPairings(n-2);
        return dp[n];
    }

    public static void main(String[] args) {
        Q_5 q = new Q_5();
        int n = 3;
        System.out.println(q.countFriendsPairings(n));
    }
}

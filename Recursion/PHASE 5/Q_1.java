// 1. Fibonacci Series

import java.util.*;
public class Q_1 {
    public static void main(String[] args) {
        int t1 = 0, t2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range");
        int end = sc.nextInt();
        
        fib(end, t1,t2,1);
        sc.close();
    }
    public static void fib(int end, int t1, int t2, int curr){
        // base
        if(curr>end)return;

        System.out.print(t1+" ");

        // recursive
        fib(end,t2,t1+t2,curr+1);
    }
} 

/*
0 1 1 2 3 5 8 
1 2 3 4 5 6 7

*/
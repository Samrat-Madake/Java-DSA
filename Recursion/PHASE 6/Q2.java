/*

Leetcode Problem 22: Generate Parentheses

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 

Constraints:

1 <= n <= 8
*/ 

import java.util.*;

public class Q2 {
        public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int count1 = 0, count2 = 0;
        func(list, sb, n, count1, count2);
        return list;
    }

    public static void func(List<String> list, StringBuilder sb, int n, int count1, int count2) {
        if (sb.length() == n*2) {
            list.add(sb.toString());
            return;
        }

        if (count1 < n) {
            sb.append("(");
            count1++;
            func(list, sb, n, count1, count2);
            sb.deleteCharAt(sb.length() - 1);
            count1--;
        }

        if (count2 < count1 ) {
            sb.append(")");
            count2++;
            func(list, sb, n, count1, count2);
            sb.deleteCharAt(sb.length() - 1);
            count2--;
        }
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println(result);
    }
}
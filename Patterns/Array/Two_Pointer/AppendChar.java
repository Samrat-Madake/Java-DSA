
// BEST QUESTION FOR TWO POINTERS AND EDGE CASES

/*
You are given two strings s and t consisting of only lowercase English letters.

Return the minimum number of characters that need to be appended to the end of s so that t becomes a subsequence of s.

A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.

 

Example 1:

Input: s = "coaching", t = "coding"
Output: 4
Explanation: Append the characters "ding" to the end of s so that s = "coachingding".
Now, t is a subsequence of s ("coachingding").
It can be shown that appending any 3 characters to the end of s will never make t a subsequence.
Example 2:

Input: s = "abcde", t = "a"
Output: 0
Explanation: t is already a subsequence of s ("abcde").
Example 3:

Input: s = "z", t = "abcde"
Output: 5
Explanation: Append the characters "abcde" to the end of s so that s = "zabcde".
Now, t is a subsequence of s ("zabcde").
It can be shown that appending any 4 characters to the end of s will never make t a subsequence.
 

Constraints:

1 <= s.length, t.length <= 105
s and t consist only of lowercase English letters.

*/

public class AppendChar {
    
    public int appendCharacters(String s, String t) {
        /*
        Approach :  
        t1, t2
        while(t1&t2){
        ch = t.charAt(t2);
        
        while(s.char(t1)!=ch)t1++;
        if(t1==len)count+len t  - t1-1
        
        t2++;
        
        }        
        */
        int ptr1 = 0, ptr2 = 0;
        int sLen = s.length(), tLen = t.length();

        while (ptr1 < sLen && ptr2 < tLen) {
            char currCh = t.charAt(ptr2);

            while (ptr1 < sLen && s.charAt(ptr1) != currCh)
                ptr1++;

            if (ptr1 == sLen) {
                // System.out.println("\n\n FINAL : ptr1 : " + ptr1);
                // System.out.println("ptr2 : " + ptr2);

                return tLen - ptr2;
            }
            if (s.charAt(ptr1) == t.charAt(ptr2))
                ptr1++;

            ptr2++;

            // System.out.println("ptr1 : " + ptr1);
            // System.out.println("ptr2 : " + ptr2);
        }
        if (ptr1 == sLen)return tLen - ptr2;

        return 0;
    }
    public static void main(String[] args) {
        AppendChar obj = new AppendChar();
        String s = "coaching", t = "coding";
        System.out.println(obj.appendCharacters(s, t));
    }
}
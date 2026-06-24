/*
345. Reverse Vowels of a String

Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in 
both lower and upper cases, more than once.

 

Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A'].
 On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"

 

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.




*/

class ReverseVowel {
    public String reverseVowels(String s) {
        int l = 0, r = s.length() - 1;

        StringBuilder sb = new StringBuilder(s);
        while (l < r) {
            while (!isVowel(s.charAt(l)) && l<r ) {
                l++;
            }
            while (!isVowel(s.charAt(r)) && l<r) {
                r--;
            }

            // System.out.print("replace :"  + " l:" +l + " r:" + r+"  ");
            
            //replace l,r
            char ch = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, ch);
            l++;
            r--;
            // System.out.println(sb);
        }
        return sb.toString();
    }

    public boolean isVowel(char ch) {
        ch =  Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;

        return false;
    }
}
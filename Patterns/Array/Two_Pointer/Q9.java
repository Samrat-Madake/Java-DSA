/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "Mr Ding"
Output: "rM gniD"
 

Constraints:

1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.

*/

public class Q9 {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);

        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                // rev the word and replce in sb
                sb.replace(i - word.length(), i, rev(word));
                word.setLength(0);
            } else {
                word.append(s.charAt(i));
            }
        }

        sb.replace(s.length() - word.length(), s.length(), rev(word));
        return sb.toString();
    }

    public static String rev(StringBuilder word) {
        int l = 0, r = word.length() - 1;

        while (l < r) {
            char ch = word.charAt(l);
            word.setCharAt(l, word.charAt(r));
            word.setCharAt(r, ch);
            l++;
            r--;
        }
        return word.toString();
    }

    public static void main(String[] args) {
        Q9 q = new Q9();
        String s = "Let's take LeetCode contest";
        System.out.println(q.reverseWords(s));
    }
}
//package BackTrack;

//Find and print all subset of a string
// "abc" = a,b,c, ab , bc , ac , abc , "null" 
// combination = n!
public class subset {

    public static void sub_string(String str, String ans, int i) {

        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.print(ans+ "  ");
            }
            return;
        }
        // Yes
        sub_string(str, ans + str.charAt(i), i + 1);

        // No
        sub_string(str, ans, i + 1);

    }

    public static void main(String[] args) {

        String str = "abc";
        sub_string(str, "", 0);

    }

}

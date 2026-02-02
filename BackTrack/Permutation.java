//package BackTrack;

public class Permutation {

    public static void permutation(String str, String ans)
    {
        if (str.length()==0) {
            System.out.print(ans+ "  ");
            return;   
        }

        for (int i = 0; i < str.length(); i++) {
            char current =str.charAt(i);

            String Newstr = str.substring(0, i)+ str.substring(i+1);
            permutation(Newstr, ans+current);
            
        }
    }

    public static void main(String[] args) {
        permutation("abc", "");
        
    }
    
}

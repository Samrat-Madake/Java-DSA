// 1. Reverse string
public class Q_1 {
    public static void main(String[] args) {
        String s = new String("Helloooo");
        StringBuilder ans = new StringBuilder();
        rev(s,ans,s.length()-1);
        // System.out.print(ans);
    }
    public static void rev(String s, StringBuilder ans, int ptr){
        if(s.length()<=0 || ptr<0){
            System.out.print(ans);
            return;
        }
        // int n = s.length();
        rev(s, ans.append(s.charAt(ptr)), ptr-1);
    }
}

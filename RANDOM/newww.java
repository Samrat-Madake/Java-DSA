public class newww {
    

    public static void main(String[] args) {
        
        int x=10;
        changess(x);

        System.out.println("After outside = "+x);
        
        
    }

    public static void changess(int x)
    {

        x=100;
        System.out.println("inside = "+x);

    }
}

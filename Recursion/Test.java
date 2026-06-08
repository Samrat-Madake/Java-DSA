class Emp{
    int id;
    public Emp(int id) {
        this.id = id;
    }
}

class Test{

    void swap(Emp e1, Emp e2) {
        Emp temp = e1;
        e1 = e2;
        e2 = temp;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Emp e1 = new Emp(1);
        Emp e2 = new Emp(2);
        System.out.println("Before : e1 id: " + e1.id + " e2 id: "+ e2.id); // Output: e1 id: 1
        
        Test t = new Test(); 
        t.swap(e1, e2);
        System.out.println("After : e1 id: " + e1.id + " e2 id: "+ e2.id); // Output: e1 id: 1
    }
}
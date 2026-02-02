public class Oops {

    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eats();   
        h1.walk();  
        System.out.println(h1.colour);
    }

}


abstract class Animal{
      String colour;
    Animal(){
        colour = " brown "; 
        System.out.println("Animal constructor called ");
    }

    void eats()
    {
        System.out.println("Animal Eats");
    }

    abstract void walk();
}

class Horse extends Animal
{

    Horse()
    {
        System.out.println("Horse consturctor called ");
    }
    void walk()
    {
        System.out.println("Horse walk on 4 leg");
    }

}
public class Oopsbasics {

    public static void main(String[] args) {

        Pen obj1 = new Pen(4,"blue");     //Parameterised Constructor
        Pen obj2 = new Pen();                          //Default Constructor
        Pen obj3 = new Pen(obj1);                      //Copy Constructor
      //  obj1.setcolour("Yellow");
      //  obj2.setcolour("Red");
      //  obj1.settip(5);
      // obj2.settip(10);
        System.out.println("Obj1 = "+ obj1.getcolour() );
        System.out.println("Obj2 = "+ obj2.getcolour() );
        System.out.println("Obj3 = "+ obj3.getcolour() );
        //
        System.out.println(obj1.gettip());
        System.out.println(obj2.gettip());
        System.out.println(obj3.gettip());
    }
}

class Pen {
    private String colour;
    private int tip;

// Parameterised Constructor(Assigns value while creation of Object)
    Pen(int tip,String colour){
       this.tip=tip;
       this.colour=colour;
    }
//Default(NON Parameterised) Constructor(if values are not passed while creation of object, This default values will be considered )
    Pen(){
        tip=5;
        colour="red";
     }
//Copy Constructer(Copies same values as passed Object)
     Pen(Pen r){
        tip=r.tip;
        colour=r.colour;
     }
    void setcolour(String colour) {
        this.colour = colour;
    }

    void settip(int tip) {
        this.tip = tip;
    }


    String getcolour(){
        return this.colour;
      }
      int gettip(){
        return this.tip;
      }
}

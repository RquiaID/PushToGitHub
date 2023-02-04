package Review6;

public class Garden {

    void hello(){

        String name="Adem";
        System.out.println("Hello "+ name );

        // name is local variable the scope of this variable only inside the block where it was defined.
        // It is not visible to another block of code it is only visible within that block of code.
        // if I sout name inside main method it will give error because its only visible inside Hello and inside that block of code
    }




    // we need a main method to create an object
    // new create object of our flower class
    public static void main(String[] args) {

        String str;
        // variable declaration on the left side.
        // we can not even make local variable be static
        // we can not use static work inside method VERY IMPORTANT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

      Flower flower1= new Flower();// here I created my object new is a keyword If I want to work
        // with that object I need to assign int my making Flower1 which is a variable name
        // Object gets created first in the right side, then, the variable flower1 points out to the object we call
        // it reference variable reference of flower class right creation of object left side reference of object
        //flower1 is the variable name that refers to the object
        // now I can access the variable of flower1 by:

        System.out.println(Flower.pretty); // this is the correct why to access instance variable
        flower1.name="Hibiscus";
        flower1.color="red";
        flower1.price=5;
        flower1.pretty=false;// not the right to access static variable but its possible
        System.out.println("Hibiscus pretty? "+flower1.pretty);
        System.out.println(flower1.price);
       // flower1.size= gives errors because it is not available in my flower class

        //After accessing variable of class now I can access method by:
        //accessing methods of Flowers class
        flower1.bloom();
        flower1.grow();
        flower1.smell();

        System.out.println("Creating second object of the flower class");

       Flower flower2= new Flower();
        flower2.name="Rose";

        flower2.color="blue";

        flower2.price=15;
        System.out.println(flower2.price);

        flower2.bloom();

        flower2.grow();

        flower2.smell();

        //flower2.stinks error since method is not defined inside the flower class/
        // So object is instanciating the class.


       Flower flower3= new Flower();
        for (int i = 0; i <=3 ; i++) {
            System.out.println(i);

        }
       // System.out.println(i);// gives error because it is a local variable and can not be accessed outside its block of code loop block of code
        // since i is not visible outside loop{}


    }

    // In Java, we have local variables, instance variables which are occur inside a class outside the method,In the class
    // but outside of block of code



}

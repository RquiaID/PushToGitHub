package Review6;

public class Flower {
    static boolean pretty=true;

    // attributes, properties
    // we define them with the help of class
    String color,type,name;
    int price;

    //behavior

    // we define behavior with the help of methods

    // we specify behavior in the form of methods

    // method is a block of code that performs a particular task when we need it we call it .
    void smell(){
        System.out.println(name + " smells good");
    }

    void bloom(){
        System.out.println(name+ " flower blooms");
    }

    void grow(){
        System.out.println(name+ " flower grows");

        // inside my flower class we created these variables  String color,type,name;
        //  int price; => when we have a class we can create multiple objects from the same class

        // In Java, we have local variables, instance variables which are occur inside a class outside the method,In the class

        // but outside of block of code

        // when we create objects each get its own instance variables everyone has its own copy without affecting other objects that is why we name it instance variable.

        // Static variable  we define them with static keyword this variable rather belongs to class rather to instance it does not belong to instance or class
        // we access static variable by class name ex: Sout(Flower.pretty);

        // Local variable is a variable that is declared inside class, method, constructor,or block of code it stays within block of code



    }

}

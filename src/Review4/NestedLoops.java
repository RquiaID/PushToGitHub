package Review4;

public class NestedLoops {
    public static void main(String[] args) {
        // loop inside another loop

             // init    // cond
        for (int i = 1; i <=3; i++) { // this is outer loop
            // only if condition is true I enter block of code ====> very important
            // when condition is false the whole code stops ex if we put i=1;i>=3 the condition is false so code stops
            // inner loop always depends on outer loop

            System.out.println(i);
            for (int j = 1; j <=4 ; j++) { // this is inner loop
                // same thing happening here init then check condition if it is true it enters block of code
                // java will keep repeating the inner block of code which is j until it becomes false then it goes back
                // to the outer
                // in this case my j loop resets like nothing happen before
                // inner loop always depends on outer loop
                System.out.println(j);

            }

        }
        System.out.println("---------------------------");
        for (int i = 1; i <5 ; i++) {
            System.out.println("Hello");
            for (int j = 1; j <=2; j++) {
                System.out.println("Bye"); // it executes outer loop once then goes to inner loop and finishes first then
                // goes back to the outer loop and executes it but the inner will keep reseting
                // outer loop controls number of execution for inner loop if my outer loop will be executing 4 times so
                // inner loop will get a chance to be repeated 4 times

            }

        }
    }
}

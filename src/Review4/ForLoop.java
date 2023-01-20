package Review4;

public class ForLoop {
    public static void main(String[] args) {
        // best loop we use it we know how many times we want to repeat block of code
        // Two keyword used with this loop , we can use continue or break
        //init    //condition
        for (int i = 2; i <= 20; i += 5) {

            System.out.println(i);
            if (i == 12) {
                System.out.println("i is equal to 12- I am breaking my loop");
                break;// exits code completely
            }
        }
        //continue skips current iteration
        for (int i = 1; i <= 10; i++) { // we supposed to run our code 10 times
            if (i % 3 == 0) {
                System.out.println();
                continue; // Java goes back to the beginning of the loop
                // and skips the rest of the code that is inside loop body
            }
            System.out.println("Hello");
            System.out.println("How are you");
            System.out.println("Hope you well");
        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }



}

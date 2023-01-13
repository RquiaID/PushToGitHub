package Review3;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int i=1;
        while(i<=4){

            System.out.println("Hello");
            i++; // make sure you put this inside curly brackets
            // best choice we don't know how many times we are going to run block of code
        }
     /*
     Let's ask a user if he/she is tired
     as long as user is not tired=> we will say let's study JAVA.
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Are you tired");
        boolean tired= scan.nextBoolean();

        while(!tired){
            System.out.println("This is great");
            System.out.println("Lets study Java");
            System.out.println("I hope you are not tired");
            tired= scan.nextBoolean();

        }
    }

}

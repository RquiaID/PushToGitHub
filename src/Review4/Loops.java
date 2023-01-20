package Review4;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
// while loop

        int a = 1;
        while (a <= 3) {
            System.out.println("I am while loop");
            a++;
        }
        //When we do not know how many times we need to repeat a block of code
        // while or do while


        // do while at least executes a block of code once if the condition is false
        // in do while loop thee is no block of code it enters block of code immediately regardless of condition
        int b = 1;
        do {
            System.out.println("do while");

        } while (b >= 3);

        // Ask students if they understand loop?
        // if they don't tell them to practice more on loops
        // if they do tell them you are good move to array concept
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Do you understand loops in Java");
            answer = scan.nextLine();
        } while (!answer.equalsIgnoreCase("yes"));
        System.out.println("Great jobs, lets learn arrays now");
        // if condition the code keeps looping if its false it stops
        // while and do while are the best example if we don't know how many times the code will be repeated.


    }
}
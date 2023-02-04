package Review4;

public class MoreNestedLoops {
    public static void main(String[] args) {
        // what is the output
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.println("Hello");

            }
            System.out.println("Bye");
            break;
        }

        System.out.println("-------what is the output ");
        for (int i = 1; i <= 3; i++) { // it goes to inner loop print it and breaks then go back to the outer print it
            // and going back to the inner loop resets it then break angan
            for (int j = 1; j <= 4; j++) {
                System.out.println("Hello");
                break;
            }
            System.out.println("Bye");


        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.println("Hello");
                break;
            }
            System.out.println("Bye");
            break;

        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j >= 4; j++) {
                System.out.println("Hello");
                break;
            }
            System.out.println("Bye");
            break;
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j < 2) {
                }
                System.out.println("Hello");
                break;
            }
            System.out.println("Bye");
            break;
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j < 2) {
                }
                System.out.println("Hello");
                continue;
            }
            System.out.println("Bye");
        }
    }
}
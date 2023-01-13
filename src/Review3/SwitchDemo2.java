package Review3;
import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        /*
        Using scanner ask user to enter browser
        based on the browser=> execute code
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter you favorite browser");
        String browser=scan.nextLine();

        switch(browser.toLowerCase()) { // because my condition is string type so my case should be string type too

            case"chrome":
                System.out.println("Test case executed in"+browser);
                break;
            case"safari":
                break;
            case"microsoft edge":
                System.out.println("Test case executed in"+browser);
                break;
            default:
                System.out.println("Browser is unkown-no execution");


        }
    }

}

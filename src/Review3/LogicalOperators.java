package Review3;

import java.sql.SQLOutput;

public class LogicalOperators {

    public static void main(String[] args) {

        System.out.println("-----------LOGICAL &&------------------");

     boolean loginButtonDisplayed=true;

     boolean loginButtonClickable=false;

     // I use them when I have to test for two or more conditions

        if(loginButtonDisplayed&&loginButtonClickable){
            System.out.println("Test case is passed");

        }else{
            System.out.println("Test Case failed");
        // when my code is false it skips if block and goes to else block

        }
        System.out.println("----------LOGICAL OR-------------");

        boolean dashboard=false;
        String message="Welcome admin";
         // trying to test two conditions and this scenario I need to use logical operator && or ||

        if(dashboard || message.equals("Welcome admin")){

            System.out.println("User is successfully logged in");

        }else{
            System.out.println("User is not logged in");
        }


        System.out.println("----------Logical NOT !----------------");
      // I use this operator when I have to reverse the result

        boolean b=true;
        System.out.println(!true); // my output here will be false

        // Real life example check box on any web or app if selected is true otherwise false

        boolean agreeCheckboxSelected=true;

        if(!agreeCheckboxSelected){

            System.out.println("I am clicking on checkbox");

        }

        System.out.println("I am clicking on submit button");


    }
}

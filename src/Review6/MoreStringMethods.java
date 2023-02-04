package Review6;

public class MoreStringMethods {
    public static void main(String[] args) {

        String myString="Today is February 2";// here I have 4 strings
        // here I say I want to split my string based on space
        // I need a variable that can hold all of these elements so, we are going to use array
        //the length of my array is 4 because there are 4 string elements.

       String[]strArray =myString.split("  ");
       for(String s :strArray){  // on the right side of the column we specify the name of the array,
           // on the left side the data type of elements
           System.out.println(s);
       }
        System.out.println("-----------------------------------------------------------");

        System.out.println(myString);//Today is February 2

       String newStr=myString.substring(9);  //substring  is a part of the string// give me a substrate
        // that starts from 9 with no ending, we can only pass integers not a string and only 2 of them
        System.out.println(newStr);

        newStr=myString.substring(9,17);
        System.out.println(newStr);// latest value is February

       int index= newStr.indexOf('b'); // here we are returning a number
        System.out.println(index);

        String anotherStr="Today is Thursday";
        index=anotherStr.indexOf("Thursday");
        System.out.println("Index of Thursday is = " +index);


    }
}

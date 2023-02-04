package Review6;

public class StringMethods {
    public static void main(String[] args) {


        String str = "Hello"; // we can not change String
         // if I print str I will get the original object which is Hello
        //by reassigning  str=str.toLowerCase we are telling java to not point to original but to the nwe one we are
        // not changing the object but where a variable point one
        // the changement starts from the right side
        //When we use String we are using the object of that class so can easily access the object of that class
        System.out.println(str.length());// 5=> number of letters
        System.out.println(str.toLowerCase());//hello
        System.out.println(str.toUpperCase());//HELLO
        System.out.println(str.charAt(1));//e
        //All these methods are already defined
        String newString=str.concat(" friends"); // concat two words=> Hello friends
        // this is a variable declaration
        System.out.println(newString);
        System.out.println(str);// Strings are immutable objects we will never be able to change the value of a string
        // the result here is original Hello
        // if I want to change it I have to reassign it to whatever method I want either to .toUpperCase or charAT

        str=str.toLowerCase(); // here I am reassgining my str to a new one with lower case
        str=str.concat(" Rquia"); // prints new assigned hello
        System.out.println(str);
      // Checks if length of the String is more than 0
      boolean empty= str.isEmpty();// this method returns a boolean value
        System.out.println(empty);

        String str1="Review b15  ";
        //removes any leading or trailing white spaces
        String newStr1=str1.trim();

        System.out.println(str1);
        System.out.println(newStr1);

        str1.trim();// str1 object gets created and have value review B15 with spaces, to cut up those spaces I need to make
        // changes and as result it gives a brand-new String


        }


    }



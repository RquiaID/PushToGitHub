package Review6;

public class StringBuilderExample {
    public static void main(String[] args) {


       StringBuilder sb= new StringBuilder("Hello");// new keyword creates an object the second part calls a constructor
        // StringBuilder class is a mutable collection of characters
        // once u create object of stringBuilder class u can access template of that are described inside that class
        // all changes happen on the same object
        sb.reverse();// proves that stringBuilder is mutable.
        System.out.println(sb); // olleh
        String str=sb.toString();// when you want to make sure your string does not change anymore
        str.toUpperCase();// proves that string is immutable
        System.out.println(str);

    }
}

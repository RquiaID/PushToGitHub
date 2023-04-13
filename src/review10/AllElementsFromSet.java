package review10;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AllElementsFromSet {
    public static void main(String[] args) {
        Set<String> qaJobs = new LinkedHashSet<>();// does not maintain the order
        // adding object/elements to the collection
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("Api Tester");
        qaJobs.add("DataBase Tester");
        System.out.println(qaJobs);

        // How to get all values from a set
        // 1- enhanced for loop:

        for (String qa : qaJobs) { // behind the scene actually it uses iterator, it looks if there is any element, it grabs it and print it until no element left
            System.out.println(qa + " ");

        }

        System.out.println("--------------------------------------------------------");

        //2- Iterator:
        // Iterator Interface has 3 methods: hasNext(), next(), remove();

        Iterator<String> it = qaJobs.iterator();

        while (it.hasNext()) {// if there is next element

            String element = it.next();// go ahead and grab it, that element is a String object
            System.out.println(element + " ");

        }

    }
}

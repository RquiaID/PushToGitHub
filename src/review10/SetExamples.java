package review10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

    public static void main(String[] args) {

        // Set is a collection of qa elements
        Set<String> qaJobs = new HashSet<>();
        // adding object/elements to the collection
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("Api Tester");
        qaJobs.add("DataBase Tester");

        qaJobs.remove("Manual Tester");
        System.out.println("Removed an element " + qaJobs);

        qaJobs.add("Api Tester");
        qaJobs.add("Api Tester");
        System.out.println("Added an element " + qaJobs);

        // I am creating the object of linkedHashset, the element between brackets is a constructor we are passing it as a parameters to invoke parametrized constructor, because inside linkedHashSet there is a constructor
        // maintains the insertion order

        Set<String> lset = new LinkedHashSet<>(qaJobs);
        System.out.println("LinkedHashSet= " + lset);

        // TreeSet sorted data.
        Set<String> tSet = new TreeSet<>();
        tSet.addAll(qaJobs);

        System.out.println("TreeSet + " + tSet);


    }
}

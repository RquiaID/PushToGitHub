package review11;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo {
    public static void main(String[] args) {

        Map<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Soap", 12.5);
        fruitMap.put("Banana", 4.9);
        fruitMap.put("Dragon Fruit", 5.6);
        fruitMap.put("Pear", 16.5);
        fruitMap.put("Orange", 15.5);
        fruitMap.put("Mango", 10.6);


        //print only elements which contain the letter a or e in their name and their price is more than 8 dollars

        for (Map.Entry<String, Double> entry : fruitMap.entrySet()) {
            String key = entry.getKey();
            double value = entry.getValue();
            if ((key.contains("a") || key.contains("e")) && value > 8.0) {// whenever we use && and || because it is going to prioritize the && so we have to put parenthesis if case we want to start with OR first
                System.out.println(key + "" + value);

            /*    //I also can use var
                //var entrySet=fruitMap.entrySet();
                //for(var entry:entrySet){
                String key=entry.getKey();
                if(key.contains("a"))||key.contains("e")&& entry.getValue()>8){
                    System.out.println(key+"" +entry.getValue());*/
                }





            }


        }
    }


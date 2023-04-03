package Allprogramweek9;

/* 7. Write a Java program to test if an array list is empty or not.*/

import java.util.ArrayList;

public class Programme7ArrayEmptyOrNot {

    public static void main(String[] args) {
       Programme7ArrayEmptyOrNot obj = new Programme7ArrayEmptyOrNot();
       obj.emptyOrNot();    // object calling
    }
    public void emptyOrNot(){  // instance method
        ArrayList<String> fruits = new ArrayList<>(); //Array list object
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Pineapple");        // String added to list
        fruits.add("Watermelon");
        fruits.add("Mellon");
        fruits.add("Grapes");

        System.out.println("Original array list " + fruits);
        System.out.println("Checking array list is empty or not " + fruits.isEmpty());
        fruits.removeAll(fruits);
        System.out.println("Array list after remove all the elements " + fruits);
        System.out.println("Checking array list is empty or not " + fruits.isEmpty());
    }

}

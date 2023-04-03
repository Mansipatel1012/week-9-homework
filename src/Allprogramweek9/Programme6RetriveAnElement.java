package Allprogramweek9;
/*6. Write a Java program to retrieve an element (at a specified index) from a given
        array list.*/

/*6. Write a Java program to retrieve an element (at a specified index) from a given
        array list.*/

import java.util.ArrayList;

public class Programme6RetriveAnElement {

    public static void main(String[] args) {
        Programme6RetriveAnElement obj = new Programme6RetriveAnElement();
        obj.element();  // obj calling
    }
    public void element(){
        // create a list and add few country to the list
        ArrayList<String> country= new ArrayList<>();
        country.add("Canada");
        country.add("United kingdom");
        country.add("America");
        country.add("Denmark");
        country.add("Australia");
        country.add("South Africa");
        // print the list
        //System.out.println(country);
        // Retrive the first and forth element
        String element = country.get(0);
        System.out.println("First elements : "+ element);
        element = country.get(4);
        System.out.println("Forth element  : "+ element);
    }
}

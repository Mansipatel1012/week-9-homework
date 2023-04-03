package Allprogramweek9;

/*4. Write a Java program to create a new array list, add some colours (string) and
        printout the collection using for each loop.*/

import java.util.ArrayList;

public class Programme4AddSomeColours {

    public static void main(String[] args) {
        Programme4AddSomeColours obj = new Programme4AddSomeColours();
        obj.colours();         // object calling
    }
    public void colours(){
        // Array object
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Blue");
        colours.add("White");
        colours.add("Purple");
        colours.add("Black");
        colours.add("gold");
        colours.add("Green");
        // for each loop
        for (String a : colours) {
            System.out.println(a);

        }
    }
}
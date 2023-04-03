package Allprogramweek9;

/*5. Write a Java program to iterate through all elements in an array list using
        Iterater.*/

import java.util.ArrayList;
import java.util.Iterator;

public class Programme5ArrayListIterater {

    public static void main(String[] args) {

       Programme5ArrayListIterater obj = new Programme5ArrayListIterater();
       obj.elements(); // object calling
    }
    public void elements(){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Toyata");
        cars.add("Tesla");
        cars.add("Hundai");
        System.out.println(cars);
        // using iterator
        Iterator<String> m = cars.iterator();
        System.out.println("The ArrayList elements are  : ");
        while (m.hasNext()) {
            System.out.println(m.next());
        }
    }
}


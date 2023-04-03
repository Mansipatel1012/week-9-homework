package Allprogramweek9;

/*3. Write a Java program to reverse an array of integer values */

import java.util.ArrayList;
import java.util.Collections;

public class Programme3ReverceArrayIntegerValue {

    public static void main(String[] args) {
        // Object creation
        Programme3ReverceArrayIntegerValue obj = new Programme3ReverceArrayIntegerValue();
        obj.number();
    }
        // Instance Method
    public void number() {
        //Array list
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        System.out.println("Before Reverse  : " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("After Reverse   : " + arrayList);
    }

}

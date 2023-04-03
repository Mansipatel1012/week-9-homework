package Allprogramweek9;

/*ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");*/

import java.util.ArrayList;
import java.util.stream.Collectors;


public class Programme11ArrayCompareList {
    public static void main(String[] args) {
    Programme11ArrayCompareList obj = new Programme11ArrayCompareList();
    obj.compareList();

    }
    public void compareList(){
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        System.out.println("Common elements: " +c1.stream().filter(c2::contains).collect(Collectors.toList()));
        c1.removeAll(c2);
        System.out.println("Un-common element from both arraylist: " + c1);

    }

}

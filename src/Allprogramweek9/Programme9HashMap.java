package Allprogramweek9;

/*9. Create a HashMap object called people that will store String keys and Integer
        values: And use for each loop to iterate the value from Map.*/

import java.util.HashMap;
import java.util.Iterator;

public class Programme9HashMap {
    public static void main(String[] args) {
       Programme9HashMap obj = new Programme9HashMap();
       obj.keyValues();  // object calling
    }
    public void keyValues(){
        //create a HashMap Object Called People
        HashMap<String, Integer> people = new HashMap<>();

        // add keys and values (Name,Age)
        people.put("John", 35);
        people.put("Angle", 34);
        people.put("Tom", 30);
        System.out.println(people);

        for (String i : people.keySet()) {  //using for each loop
            System.out.println("Name: " + i + " Age:" + people.get(i));
        }
        Iterator<String> m = people.keySet().iterator();  // using iterator value
        while (m.hasNext());
        System.out.println(m.next());
    }
}

package Allprogramweek9;

/*8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
        Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
        else).*/

import java.util.HashSet;

public class Programme8HashSetObject {

    public static void main(String[] args) {
    Programme8HashSetObject obj = new Programme8HashSetObject();
    obj.setNumbers();

    }
    public void setNumbers() {
        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<>();
        // Add value to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        // Show which number between 1 and 100 are in the set
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}
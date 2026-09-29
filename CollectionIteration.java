import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class CollectionIteration {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Arun");
        names.add("Priya");

        System.out.println("ArrayList:");

        for (String name : names) {
            System.out.println(name);
        }

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);

        System.out.println("\nHashSet:");

        for (Integer number : numbers) {
            System.out.println(number);
        }

        HashMap<Integer, String> students =
                new HashMap<>();

        students.put(101, "Arun");
        students.put(102, "Priya");

        System.out.println("\nHashMap:");

        for (Map.Entry<Integer, String> entry
                : students.entrySet()) {

            System.out.println(
                    entry.getKey() + " - "
                    + entry.getValue());
        }
    }
}
import java.util.HashMap;

public class HashMapStudent {

    public static void main(String[] args) {

        HashMap<Integer, String> students =
                new HashMap<>();

        students.put(101, "Arun");
        students.put(102, "Priya");
        students.put(103, "Kumar");

        System.out.println("Student Details:");

        for (Integer id : students.keySet()) {
            System.out.println(id + " - " + students.get(id));
        }
    }
}
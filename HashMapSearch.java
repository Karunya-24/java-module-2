import java.util.HashMap;

public class HashMapSearch {

    public static void main(String[] args) {

        HashMap<Integer, String> students =
                new HashMap<>();

        students.put(101, "Arun");
        students.put(102, "Priya");
        students.put(103, "Kumar");

        int searchId = 102;

        if (students.containsKey(searchId)) {
            System.out.println(
                    "Student Name = " + students.get(searchId));
        } else {
            System.out.println("Student not found");
        }
    }
}
import java.util.ArrayList;

public class ArrayListAddDisplay {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Arun");
        students.add("Priya");
        students.add("Kumar");
        students.add("Divya");

        System.out.println("Student List:");

        for (String student : students) {
            System.out.println(student);
        }
    }
}
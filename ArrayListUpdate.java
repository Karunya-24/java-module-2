import java.util.ArrayList;

public class ArrayListUpdate {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Arun");
        students.add("Priya");
        students.add("Kumar");

        System.out.println("Before Update:");
        System.out.println(students);

        students.set(1, "Divya");

        System.out.println("After Update:");
        System.out.println(students);
    }
}
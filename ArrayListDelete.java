import java.util.ArrayList;

public class ArrayListDelete {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Arun");
        students.add("Priya");
        students.add("Kumar");

        System.out.println("Before Delete:");
        System.out.println(students);

        students.remove("Priya");

        System.out.println("After Delete:");
        System.out.println(students);
    }
}
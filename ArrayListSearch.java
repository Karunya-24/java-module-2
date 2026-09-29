import java.util.ArrayList;

public class ArrayListSearch {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Arun");
        students.add("Priya");
        students.add("Kumar");

        String searchName = "Priya";

        if (students.contains(searchName)) {
            System.out.println(searchName + " found");
        } else {
            System.out.println(searchName + " not found");
        }
    }
}
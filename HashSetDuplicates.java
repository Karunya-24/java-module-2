import java.util.HashSet;

public class HashSetDuplicates {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("Unique Numbers:");

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
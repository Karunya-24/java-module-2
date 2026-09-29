import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentFileStorage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        try {

            FileWriter writer =
                    new FileWriter(
                            "students.txt", true);

            writer.write(
                    id + "," + name + "," + course + "\n");

            writer.close();

            System.out.println(
                    "Student data saved successfully");

        } catch (IOException e) {

            System.out.println(
                    "Unable to save data");
        }

        scanner.close();
    }
}
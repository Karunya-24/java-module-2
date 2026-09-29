import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) {

        try {

            FileWriter writer =
                    new FileWriter("student.txt");

            writer.write("Student Name: Arun\n");
            writer.write("Course: Java");

            writer.close();

            System.out.println(
                    "Data written successfully");

        } catch (IOException e) {

            System.out.println(
                    "File error: " + e.getMessage());
        }
    }
}
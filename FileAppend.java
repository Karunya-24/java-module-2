import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {

    public static void main(String[] args) {

        try {

            FileWriter writer =
                    new FileWriter(
                            "student.txt", true);

            writer.write("\nAge: 20");

            writer.close();

            System.out.println(
                    "Data appended successfully");

        } catch (IOException e) {

            System.out.println(
                    "File error");
        }
    }
}
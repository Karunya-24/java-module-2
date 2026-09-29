import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) {

        try {

            FileReader reader =
                    new FileReader("student.txt");

            FileWriter writer =
                    new FileWriter("student_copy.txt");

            int character;

            while ((character = reader.read()) != -1) {

                writer.write(character);
            }

            reader.close();
            writer.close();

            System.out.println(
                    "File copied successfully");

        } catch (IOException e) {

            System.out.println(
                    "File error");
        }
    }
}
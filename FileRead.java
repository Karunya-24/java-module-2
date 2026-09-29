import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

    public static void main(String[] args) {

        try {

            File file = new File("student.txt");

            Scanner scanner =
                    new Scanner(file);

            while (scanner.hasNextLine()) {

                String data = scanner.nextLine();

                System.out.println(data);
            }

            scanner.close();

        } catch (FileNotFoundException e) {

            System.out.println(
                    "File not found");
        }
    }
}
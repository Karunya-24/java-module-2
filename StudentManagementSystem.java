import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

class Student {

    int id;
    String name;
    String course;

    Student(int id, String name, String course) {

        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {

        return "ID: " + id
                + " | Name: " + name
                + " | Course: " + course;
    }
}

public class StudentManagementSystem {

    static Scanner scanner = new Scanner(System.in);

    static ArrayList<Student> students =
            new ArrayList<>();

    static HashMap<Integer, Student> studentMap =
            new HashMap<>();

    static HashSet<Integer> studentIds =
            new HashSet<>();

    // Add Student
    static void addStudent() {

        try {

            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();

            scanner.nextLine();

            if (studentIds.contains(id)) {

                throw new Exception(
                        "Student ID already exists!");
            }

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Course: ");
            String course = scanner.nextLine();

            Student student =
                    new Student(id, name, course);

            students.add(student);

            studentMap.put(id, student);

            studentIds.add(id);

            System.out.println(
                    "Student added successfully!");

        } catch (Exception e) {

            System.out.println(
                    "Error: " + e.getMessage());
        }
    }

    // View Students
    static void viewStudents() {

        if (students.isEmpty()) {

            System.out.println(
                    "No students available.");

            return;
        }

        System.out.println(
                "\n--- Student List ---");

        for (Student student : students) {

            System.out.println(student);
        }
    }

    // Search Student
    static void searchStudent() {

        try {

            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();

            if (studentMap.containsKey(id)) {

                System.out.println(
                        studentMap.get(id));

            } else {

                System.out.println(
                        "Student not found.");
            }

        } catch (InputMismatchException e) {

            System.out.println(
                    "Please enter a valid ID.");

            scanner.nextLine();
        }
    }

    // Update Student
    static void updateStudent() {

        try {

            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();

            scanner.nextLine();

            Student student =
                    studentMap.get(id);

            if (student == null) {

                System.out.println(
                        "Student not found.");

                return;
            }

            System.out.print("Enter New Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter New Course: ");
            String course = scanner.nextLine();

            student.name = name;
            student.course = course;

            System.out.println(
                    "Student updated successfully!");

        } catch (InputMismatchException e) {

            System.out.println(
                    "Invalid input.");

            scanner.nextLine();
        }
    }

    // Delete Student
    static void deleteStudent() {

        try {

            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();

            Student student =
                    studentMap.get(id);

            if (student == null) {

                System.out.println(
                        "Student not found.");

                return;
            }

            students.remove(student);

            studentMap.remove(id);

            studentIds.remove(id);

            System.out.println(
                    "Student deleted successfully!");

        } catch (InputMismatchException e) {

            System.out.println(
                    "Invalid input.");

            scanner.nextLine();
        }
    }

    // Main Menu
    public static void main(String[] args) {

        while (true) {

            System.out.println(
                    "\n==============================");

            System.out.println(
                    "   STUDENT MANAGEMENT SYSTEM");

            System.out.println(
                    "==============================");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            try {

                int choice = scanner.nextInt();

                switch (choice) {

                    case 1:
                        addStudent();
                        break;

                    case 2:
                        viewStudents();
                        break;

                    case 3:
                        searchStudent();
                        break;

                    case 4:
                        updateStudent();
                        break;

                    case 5:
                        deleteStudent();
                        break;

                    case 6:

                        System.out.println(
                                "Thank you for using the system!");

                        scanner.close();

                        return;

                    default:

                        System.out.println(
                                "Invalid choice!");
                }

            } catch (InputMismatchException e) {

                System.out.println(
                        "Please enter a number.");

                scanner.nextLine();
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the entered marks.
        Scanner scanner = new Scanner(System.in);

        // Stores the student marks.
        int[] marks = new int[5];

        // Stores the entered marks.
        marks[0] = scanner.nextInt();
        marks[1] = scanner.nextInt();
        marks[2] = scanner.nextInt();
        marks[3] = scanner.nextInt();
        marks[4] = scanner.nextInt();

        // Scans the roll number of the student.
        int rollNumber = scanner.nextInt();

        // Prints details.
        System.out.println("The student with roll number " + rollNumber + " has scored " + marks[rollNumber]
                + " marks");
    }
}
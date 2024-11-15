import java.util.Scanner;

public class NameLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10]; // Array to store 10 names

        // Get names from user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name " + (i + 1) + ":  ");
            names[i] = scanner.nextLine();
        }

        // Display name number and length
        System.out.println("\nName Information: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Name " + (i + 1) + ":  " + names[i] + " (Length:  " + names[i].length() + ")");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Are you a student? (true/false): ");
        boolean student = sc.nextBoolean();

        // Logical AND
        System.out.println("AND (age >= 18 && student) : "
                + (age >= 18 && student));

        // Logical OR
        System.out.println("OR (age >= 18 || student) : "
                + (age >= 18 || student));

        // Logical NOT
        System.out.println("NOT (!student) : "
                + (!student));

        sc.close();
    }
}
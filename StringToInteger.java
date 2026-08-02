import java.util.Scanner;

public class StringToInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String str = sc.nextLine();

        try {

            int number = Integer.parseInt(str);

            System.out.println("Integer value = " + number);

        }
        catch (NumberFormatException e) {

            System.out.println("Invalid input! Please enter a valid integer.");

        }

        sc.close();
    }
}
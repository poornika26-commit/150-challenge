import java.util.Scanner;

public class AsciValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int ascii = ch;
        System.out.println("Ascii value :" + ascii);

        sc.close();
    }
    
}

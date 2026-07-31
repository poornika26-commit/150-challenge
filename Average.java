import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);

        System.out.println("Enter the  5 values: ");

        int a = ns.nextInt();
        int b = ns.nextInt();
        int c = ns.nextInt();
        int d = ns.nextInt();
        int e = ns.nextInt();

        int average=(a+b+c+d+e)/5;

        System.out.println(("The average of the  values :" + average));

        ns.close();

    }
    
}

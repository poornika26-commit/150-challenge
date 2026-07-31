import java.util.Scanner;
public class Kilometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of  Kilometer:");
        int kilo = sc.nextInt();

        int meter = (kilo * 1000);

        System.out.println("Kilometer:" + kilo);
        System.out.println("Meter:"+ meter);
        
        sc.close();
    }
    
}

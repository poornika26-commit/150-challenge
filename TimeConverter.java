import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in seconds:");
        double second = sc.nextInt();

        double hour = (second/3600);
        double min = (second/60);

        System.out.println("Hour:" + hour);
        System.out.println("Minutes:"+ min);
        
        sc.close();
    }
    
}



import java.util.Scanner;
public class Square{
    public static void main(String[] args) {
        System.out.println("Enter any number:");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
      

        int sq = a*a;

        System.out.println("The square of the number:" + sq);
        sc.close();
        
    }
    
}

import java.util.Scanner;
public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Enter radius of cirlce: ");
        double r = sc.nextInt();


        double area = (PI*r*r);
       

        System.out.println("The Area of the Circle = " + area);
        
        
        sc.close();
    }
}
    


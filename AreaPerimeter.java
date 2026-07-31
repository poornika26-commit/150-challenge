 import java.util.Scanner;
public class AreaPerimeter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        int l = sc.nextInt();

        System.out.print("Enter width of rectangle: ");
        int w = sc.nextInt();

        int area = (l*w);
        int perimeter = 2*(l+w);

        System.out.println("The Area of the Rectangle = " + area);
        
        System.out.println("The Perimeter of the Rectangle = " + perimeter);
        sc.close();
    }
}
    


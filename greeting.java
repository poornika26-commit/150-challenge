import java.util.Scanner;
public class greeting {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name =sc.nextLine();
        
        String msg="Hello everyone! ";
        System.out.println(msg + " I am " + name);
        sc.close();
    }

    
}

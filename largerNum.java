import java.util.Scanner;
public class largerNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();
          
        System.out.println("Enter the third number:");
        int c = sc.nextInt();


        if(a>b && a>c){
            System.out.println("The largest number among three :"  +a);
        }
        else if(b>a && b>c){
            System.out.println("The largest number among three :" + b);
        }
        else{
            System.out.println("The largest number among three :" +c);
        }
        sc.close();
    }

}
public class CheckDataType {
    public static void main(String[] args) {

        Object value = 25.5f;   // Change this to test different types

        if (value instanceof Integer) {
            System.out.println("The variable is an Integer.");
        } 
        else if (value instanceof Float) {
            System.out.println("The variable is a Float.");
        } 
        else if (value instanceof String) {
            System.out.println("The variable is a String.");
        } 
        else {
            System.out.println("Unknown Data Type.");
        }
    }
}
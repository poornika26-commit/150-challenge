public class explicit {
    public static void main(String[] args) {
        String word = "STEMCELL";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int value = (int) ch;

            System.out.println(ch + " = " + value);
        }
    }
}
public class reverseString {

    public static void main(String[] args) {
        String str = "ABHISHEK";

        char[] ch = str.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
        System.out.println();

    }
}

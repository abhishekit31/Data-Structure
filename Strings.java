public class Strings {
    public static void main(String[] args) {
        String str1 = "Abhishek";
        String str2 = "Abhishek";

        String str3 = new String("Abhishek");
        String str4 = new String("Abhishek");

        // System.out.println(str1.length()); // print the length of the string

        // System.out.println(str1.equals(str3)); // true
        // System.out.println(str1 == str3); // false

        // System.out.println(str3 == str4); // false
        // System.out.println(str3.equals(str4)); // true

        // System.out.println(str1.compareTo(str2)); // true
        // System.out.println(str3.compareTo(str4)); // true

        // System.out.println(str1.charAt(5)); // print the character present at this
        // index

        // System.out.println(str1.replace("A", "V")); // replace the single passed
        // chacracter

        System.out.println(str1.replaceAll("Abhishek", "Vishal")); // repalce the whole string
    }
}

package Array;

import java.util.Arrays;

public class Anagrams {

    public static boolean isAnagrams(String str1, String str2) {

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println(isAnagrams(str1, str2)
                ? str1 + " and " + str2 + " are anagrams."
                : str1 + " and " + str2 + " are not anagrams.");
    }
}

import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int dup = num;
        int rev = 0;

        while (num > 0) {
            int ld = num % 10;
            rev = (rev * 10) + ld;
            num = num / 10;
        }
        if (dup == rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
        sc.close();
    }
}
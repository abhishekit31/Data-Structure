import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int dup = num;
        int sum = 0;

        while (num > 0) {
            int ld = num % 10;
            sum = sum + (ld * ld * ld);
            num = num / 10;
        }
        System.out.println((sum == dup) ? "number is armstrong" : "number is not armstrong");

        sc.close();
    }
}

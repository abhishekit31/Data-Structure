public class fibonacci {

    public static int fidfib(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fidfib(n - 1) + fidfib(n - 2);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        int result = fidfib(num);
        System.out.println(result);
    }
}

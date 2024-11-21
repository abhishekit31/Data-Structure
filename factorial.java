public class factorial {

    public static int findfact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * findfact(num - 1);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        int result = findfact(num);

        System.out.println("Tha facotrial of " + num + " is : " + result);
    }
}

package LinkedList;

public class mains {

    public static void main(String[] args) {
        LinkedList nums = new LinkedList();

        nums.add(4);
        nums.add(8);
        nums.add(3);

        nums.addFirst(7);

        nums.delete(7);

        nums.printValues();
    }

}
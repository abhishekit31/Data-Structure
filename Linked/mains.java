package Linked;

public class mains {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.add(5);
        ll.add(9);
        ll.add(6);

        ll.addFirst(7);

        ll.addLast(12);

        ll.delete(9);

        ll.print();
    }
}
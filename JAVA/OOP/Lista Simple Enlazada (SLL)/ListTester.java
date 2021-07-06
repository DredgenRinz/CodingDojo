public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        System.out.println("LinkedList: 3 4 10 5 15 2 ");
        sll.remove();
        sll.remove();
        sll.printValues();
        sll.removeAt(1);
        sll.removeAt(2);
        sll.printValues();
    }
}
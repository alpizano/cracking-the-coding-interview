public class Test {
    public void kthToLast(Node list, int k) {
        int counter = 0;

        for(Node cursor = list; cursor != null; cursor = cursor.next) {

        }

    }
    public static void main(String[] args) {
        System.out.println("Hello wrold");

        Node head = new Node(69);
        head.appendToTail(55);
        head.appendToTail(13);
        head.appendToTail(42);
        head.appendToTail(11);

        Test test = new Test();
        test.kthToLast(head, 3);

    }
}

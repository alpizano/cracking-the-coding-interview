public class Test {
    public int kthToLast(Node list, int k) {
        int counter = 0;
        int val = 0;

        for(Node cursor = list; cursor != null; cursor = cursor.next) {
            counter++;
        }
        
        int kth = counter - k;

        Node cursor = list;
        for(int i=0; i<= kth; i++) {
            val = cursor.data;
            cursor = cursor.next;
        }
        return val;

    }
    public static void main(String[] args) {
        System.out.println("Hello wrold");

        Node head = new Node(69);
        head.appendToTail(55);
        head.appendToTail(13);
        head.appendToTail(42);
        head.appendToTail(11);

        Test test = new Test();
        System.out.println(test.kthToLast(head, 5));

    }
}

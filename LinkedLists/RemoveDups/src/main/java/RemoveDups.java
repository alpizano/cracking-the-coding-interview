public class RemoveDups {

    public static void main(String[] args) {


        Node head = new Node(55);

        head.appendToTail(78);

        System.out.println(head);

        for(Node cursor = head; cursor != null; cursor = cursor.next) {
            System.out.println(cursor.data);
        }
    }

}

import java.util.Hashtable;

public class Test {

    public static void removeDups(Node list) {
        Hashtable<Integer,String> table = new Hashtable();

        for(Node cursor = list; cursor != null; cursor = cursor.next) {
            if (table.size() > 0) {
                if(table.containsKey())
                table.put(1,Integer.toString(cursor.data));
            }
        }
    }


        public static void main(String[] args) {
        // Create linked list 1 -> 5 -> 1 -> 7 -> 3 -> 3 -> 9
            Node head = new Node(1);

            head.appendToTail(5);
            head.appendToTail(1);
            head.appendToTail(7);
            head.appendToTail(3);
            head.appendToTail(3);
            head.appendToTail(9);

            for(Node cursor = head; cursor != null; cursor = cursor.next) {
                System.out.println(cursor.data);
            }

            Test test = new Test();
            test.removeDups(head);
        }
}

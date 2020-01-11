import java.util.Hashtable;

public class Test {


    public static void removeDups(Node head) {
        Hashtable<Integer,Integer> table = new Hashtable();

        int counter = 0;
        Node prevCursor = head;
        table.put(prevCursor.data,1);

        for(Node cursor = head.next; cursor != null; cursor = cursor.next) {
            System.out.println();
            System.out.println("prev cursor: " + prevCursor.data + " , after cursor: "+ cursor.data);

            if (table.size() > 0) {
                if(table.containsKey(cursor.data)) {
                    if(cursor.next != null) {

                        //prevCursor.removeNodeAfter();
                        //prevCursor.next = prevCursor.next.next;
                        cursor = prevCursor;
                        continue;
                    }
                    else {
                        prevCursor.removeNodeAtEnd();
                    }
                }
            }

            table.put(cursor.data,1);
            prevCursor = prevCursor.next;
            counter++;
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
            head.appendToTail(8);
            head.appendToTail(7);

            for(Node cursor = head; cursor != null; cursor = cursor.next) {
                System.out.print(cursor.data + " ");
            }
            //System.out.println(head.next.data);

            Test test = new Test();
            test.removeDups(head);

            //head.next = head.next.next;

            for(Node cursor = head; cursor != null; cursor = cursor.next) {
                System.out.print(cursor.data + " ");
            }

        }
}

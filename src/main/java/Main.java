public class Main {
    static boolean deleteMidNode(MySinglyLinkedListNode<Character> n) {
        if (n == null || n.next == null) {
            return false;
        }

        n.data = n.next.data;
        n.next = n.next.next;
        return true;
    }

    public static void main(String[] args) {
        MySinglyLinkedList<Character> list = new MySinglyLinkedList<>();
        list.addEnd('a');
        list.addEnd('b');
        list.addEnd('c');
        list.addEnd('d');
        list.addEnd('e');
        list.addEnd('f');
        list.printMe();
        MySinglyLinkedListNode<Character> c = list.head;
        c = c.next;
        while (c != null) {
            if(c.data == 'c') {
                break;
            }
            c = c.next;
        }
        deleteMidNode(c);
        list.printMe();
    }
}

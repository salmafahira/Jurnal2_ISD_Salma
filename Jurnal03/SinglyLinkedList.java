public class SinglyLinkedList<E> {
    Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void addNode(buku data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Buku telah berhasil ditambahkan");
    }

    public void deleteNode() {
        if (head == null) {
            System.out.println("Linked list kosong, tidak ada yang dapat dihapus");
        } else if (head.next == null) {
            head = null;
            System.out.println("Buku telah berhasil dihapus");
        } else {
            Node current = head;
            Node previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            System.out.println("Buku telah berhasil dihapus");
        }
    }
    

    public void printList() {
        if (head == null) {
            System.out.println("Tidak Ada Daftar Buku");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;

            }
        }
    }
}
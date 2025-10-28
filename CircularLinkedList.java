class CircularLinkedList {

    Node head, tail;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        System.out.println(data + " added at the beginning");
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        System.out.println(data + " added at the end");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println(head.data + " deleted from beginning");
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println(tail.data + " deleted from end");
        if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = head;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.addFirst(10);
        cll.addLast(20);
        cll.addFirst(5);
        cll.addLast(25);

        cll.display();

        cll.deleteFirst();
        cll.display();

        cll.deleteLast();
        cll.display();
    }
}

import java.util.*;

class CollectionsDemo {

    public static void main(String[] args) {

        // Array
        int[] arr = {10, 20, 30, 40};
        System.out.println("Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("Linked List: " + linkedList);

        // Doubly Linked List (using LinkedList)
        LinkedList<Integer> doublyList = new LinkedList<>();
        doublyList.addFirst(10);
        doublyList.addLast(20);
        doublyList.addLast(30);
        System.out.println("Doubly Linked List: " + doublyList);

        // Circular Linked List
        CircularLinkedList cll = new CircularLinkedList();
        cll.add(5);
        cll.add(10);
        cll.add(15);
        System.out.print("Circular Linked List: ");
        cll.display();
    }
}

class CircularLinkedList {
    Node head = null;

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = newNode;
            newNode.next = head;
        }
    }

    void display() {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

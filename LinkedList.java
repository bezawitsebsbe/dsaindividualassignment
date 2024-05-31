
class Node {
	
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}



public class LinkedList {
	 Node head;

	    public void insertAtPos(int data, int position) {
	        // Create a new node
	        Node newNode = new Node(data);

	        // If the list is empty, set the new node as the head
	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        // If the position is 0, insert the new node at the beginning
	        if (position == 0) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }

	        // Traverse the list to the specified position
	        Node current = head;
	        int currentPosition = 0;
	        while (current.next != null && currentPosition < position - 1) {
	            current = current.next;
	            currentPosition++;
	        }

	        // Insert the new node at the specified position
	        newNode.next = current.next;
	        current.next = newNode;
	    }

	    // Display elements of the linked list
	    public void display() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public void deleteAtPosition(int position) {
	        if (head == null) return;
	        if (position == 1) {
	            head = head.next;
	            return;
	        }
	        Node prev = head;
	        for (int i = 1; i < position - 1 && prev.next != null; i++) {
	            prev = prev.next;
	        }
	        if (prev.next != null) {
	            prev.next = prev.next.next;
	        }
	    }

	    public void deleteAfterNode(Node node) {
	        if (node == null || node.next == null) return;
	        node.next = node.next.next;
	    }

	    public boolean searchNode(int value) {
	        Node current = head;
	        while (current != null) {
	            if (current.data == value) {
	                return true;
	            }
	            current = current.next;
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        list.insertAtPos(1, 0);
	        list.insertAtPos(2, 1);
	        list.insertAtPos(3, 2);
	        list.insertAtPos(4, 1);
	        list.display(); // Output: 1 4 2 3
	        list.deleteAtPosition(2);
	        list.display(); // Output: 1 4 3
	        System.out.println(list.searchNode(4)); // Output: true
	        System.out.println(list.searchNode(5)); // Output: false
	    }
	}
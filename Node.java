
public class Node {
    private Task task;
    private Node next;

    // Constructor
    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
    // Getter and Setter methods
    public Task getTask() {
        return this.task;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}

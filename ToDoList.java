
public class ToDoList {
	private Node head;

	public void addToDo(Task task) {
	    Node newNode = new Node(task);
	    if (head == null) {
	        head = newNode;
	    } else {
	        Node current = head;
	        while (current.getNext() != null) {
	            current = current.getNext();
	        }
	        current.setNext(newNode);
	    }
	}

	public void markToDoAsCompleted(String title) {
	    Node current = head;
	    while (current != null) {
	        if (current.getTask().getTitle().equals(title)) {
	            current.getTask().markCompleted();
	            return;
	        }
	        current = current.getNext();
	    }
	    System.out.println("Task with title '" + title + "' not found.");
	}

	public void viewToDoList() {
	    if (head == null) {
	        System.out.println("To-do list is empty.");
	    } else {
	        System.out.println("To-do List:");
	        Node current = head;
	        while (current != null) {
	            Task task = current.getTask();
	            System.out.println("- " + task.getTitle() + ": " + task.getDescription() + " (" + (task.isCompleted() ? "Completed" : "Incomplete") + ")");
	            current = current.getNext();
	        }
	    }
	}

	public static void main(String[] args) {
	    ToDoList toDoList = new ToDoList();

	    // Add some tasks
	    toDoList.addToDo(new Task("project", "Complete the final report for the project"));
	    toDoList.addToDo(new Task("Buy groceries", "Purchase items from the grocery store"));
	    toDoList.addToDo(new Task("Clean", "Vacuum, dust, and tidy up the entire house"));
	    toDoList.addToDo(new Task("Call mom", "Check in with mom and see how she's doing"));

	    // View the to-do list
	    toDoList.viewToDoList();
	    System.out.println();

	    // Mark a task as completed
	    toDoList.markToDoAsCompleted("Buy groceries");

	    // View the updated to-do list
	    toDoList.viewToDoList();
	    System.out.println();

	    // Try to mark a non-existent task as completed
	    toDoList.markToDoAsCompleted("Learn a new language");
	}

}

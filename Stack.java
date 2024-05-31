
public class Stack {
	    Node top;
        public void push(int data) {
	        Node newNode = new Node(data);
	        newNode.next = top;
	        top = newNode;
	    }

	    public int pop() {
	        if (top == null) {
	            throw new RuntimeException("Stack is empty");
	        }
	        int data = top.data;
	        top = top.next;
	        return data;
	    }

	    public int peek() {
	        if (top == null) {
	            throw new RuntimeException("Stack is empty");
	        }
	        return top.data;
	    }

	    public boolean isEmpty() {
	        return top == null;
	    }
	
	    public static void main(String[] args) {
	        Stack stack = new Stack();
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);
	        System.out.println(stack.peek()); // Output: 3
	        System.out.println(stack.pop()); // Output: 3
	        System.out.println(stack.peek()); // Output: 2
	        System.out.println(stack.isEmpty()); // Output: false
	    }
	}



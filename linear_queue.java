package question_no_3;


public class linear_queue {
	 private int maxSize;
	    private int top;
	    private int[] stackArray;

	    public linear_queue(int size) {
	        maxSize = size;
	        stackArray = new int[maxSize];
	        top = -1;
	    }

	    public void push(int value) {
	        if (top == maxSize - 1) {
	            System.out.println("Stack is full");
	        } else {
	            stackArray[++top] = value;
	        }
	    }

	    public int pop() {
	        if (top == -1) {
	            System.out.println("Stack is empty");
	            return -1;
	        } else {
	            return stackArray[top--];
	        }
	    }

	    public boolean isEmpty() {
	        return (top == -1);
	    }
}
	    
	




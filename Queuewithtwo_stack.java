package question_no_3;

public class Queuewithtwo_stack {
	private linear_queue stack1;
    private linear_queue stack2;

    public  Queuewithtwo_stack (int size) {
        stack1 = new linear_queue(size);
        stack2 = new linear_queue(size);
    }

    public void enqueue(int value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int dequeue() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return stack1.pop();
        }
    }

    public int peek() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return stack1.StackArray[0];
        }
    }

}



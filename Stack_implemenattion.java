package question_no_2;


public class Stack_implemenattion {
	int size,top;
	int[] numbers;
	Stack_implemenattion(int maxsize){
		size =0;
		top=-1;
		numbers = new int [maxsize];
	}
	public int size() {
		return size;
	}
	void push(int value) {
		if(!isfull()) {	
			numbers[++top] = value;
			size++;
		}
		else {
			System.out.println("Stack is full");
		}
	}
	public int pop() {
		if (!isEmpty()) {
			int data = numbers[top--];
			size--;	
			return data;
		}
		return -1;
		
				
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isfull() {
		return size == numbers.length;
	}
	public int peek() {
		if(top>=0) {
			return numbers[top];
		}
		return -1;
	}
	public static void main(String args[]) {
		Stack_implemenattion Stack = new Stack_implemenattion(5);
		Stack.push(11);
		Stack.push(22);
        Stack.push(33);
        Stack.push(44);
        Stack.push(55);
        Stack.pop();
        Stack.pop();
        Stack.peek();
		for(int i= 0;i<Stack.size;i++) {
			System.out.println(Stack.numbers[i]);
		}
		
	}
		

}

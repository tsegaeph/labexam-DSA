package package2;

public class Stack {
	private int maxSize;
	private int[] stackArray;
	private int top;
	public Stack(int size) {
		maxSize=size;
		stackArray= new int[maxSize];
		top=-1;
	}
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack is full, Can not push element "+value);}
		else { top++;
		stackArray[top]=value;
		System.out.println("pushed "+value+" onto the stack");
		}
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty, can not pop up element");
			return -1; // return the default value indicating failure
		}else { int poppedValue = stackArray[top];
		top--;
		System.out.println("popped "+poppedValue+" from the stack.");
		 return poppedValue;
			}
		}
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return(top==maxSize-1);	
	}
	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(20);
		stack.push(50);
		stack.push(70);
		int poppedValue=  stack.pop();
		System.out.println("popped value: "+poppedValue);
		
	}
	
}
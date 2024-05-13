package package3;


	public class QueueUsingStacks<T> {
	    private T[] stack1;
	    private T[] stack2;
	    private int top1;
	    private int top2;

	    public QueueUsingStacks(int capacity) {
	        stack1 = (T[]) new Object[capacity];
	        stack2 = (T[]) new Object[capacity];
	        top1 = -1;
	        top2 = -1;
	    }

	    public void enqueue(T item) {
	        if (isFull()) {
	            System.out.println("Queue is full. Cannot enqueue item.");
	            return;
	        }

	        stack1[++top1] = item;
	    }

	    public T dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot dequeue item.");
	            return null;
	        }

	        if (top2 == -1) {
	            while (top1 >= 0) {
	                stack2[++top2] = stack1[top1--];
	            }
	        }

	        return stack2[top2--];
	    }

	    public T peek() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot peek item.");
	            return null;
	        }

	        if (top2 == -1) {
	            while (top1 >= 0) {
	                stack2[++top2] = stack1[top1--];
	            }
	        }

	        return stack2[top2];
	    }

	    public boolean isEmpty() {
	        return (top1 == -1 && top2 == -1);
	    }

	    public boolean isFull() {
	        return (top1 == stack1.length - 1 || top2 == stack2.length - 1);
	    }

	    public static void main(String[] args) {
	        QueueUsingStacks<Integer> queue = new QueueUsingStacks<>(5);

	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);

	        System.out.println(queue.dequeue()); // Dequeues 10
	        System.out.println(queue.peek()); // Peeks 20

	        queue.enqueue(40);
	        queue.enqueue(50);
	        queue.enqueue(60); // This enqueue operation will fail as the queue is full
	    }
	}
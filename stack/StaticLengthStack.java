public class StaticLengthStack {
    private int maxSize;
    private int top;
    private int[] elements;

    public StaticLengthStack(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        this.elements = new int[maxSize];
    }

    public void push(int item) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        elements[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
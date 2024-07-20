import java.util.Arrays;

public class DynamicLengthStack {
    private String[] elements;
    private int size;
    private int capacity;

    public DynamicLengthStack() {
        size = 0;
        capacity = 10;
        elements = new String[capacity];
    }

    public void push(String element) {
        if (isFull()) {
            capacity *= 2;
            elements = Arrays.copyOf(elements, capacity);
        } else {
            elements[size] = element;
            size++;
        }
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        String element = elements[size - 1];
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    public String peek() {
        return elements[0];
    }

    public boolean isFull() {return size == capacity;}

    public boolean isEmpty() {return size == 0;}
}
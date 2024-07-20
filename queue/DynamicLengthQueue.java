public class DynamicLengthQueue {
    private String[] elements;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    public DynamicLengthQueue(int capacity) {
        this.capacity = capacity;
        elements = new String[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void enqueue(String element) {
        if (size == capacity) {
            capacity = capacity * 2;
        }
        elements[tail] = element;
        tail = (tail + 1) % capacity; // To keep tail within the bounds of capacity
        size++;
    }

    public String dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        String element = elements[head];
        head = (head + 1) % capacity; // When the front element is dequeue'd the element next line in become the head
        size--;
        return element;
    }

    public int size()  {
        return size;
    }

    public String peek() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[head];
    }


}

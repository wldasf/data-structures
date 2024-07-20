import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StaticLengthQueueTest {

    @Test
    public void givenQueue_whenEmpty_thenExpectedResultIsReturned() {
        StaticLengthQueue queue = new StaticLengthQueue(5);
        assertEquals(0, queue.size());
    }

    @Test
    public void givenAnEmptyQueue_whenOneItemInQueue_thenExpectedResultIsReturned() {
        StaticLengthQueue queue = new StaticLengthQueue(5);
        queue.enqueue("A");
        assertEquals(1, queue.size());
        assertEquals("A", queue.peek());
    }

    @Test
    public void givenAnEmptyQueue_whenEnqueueMultipleElements_thenExpectedResultIsReturned() {
        StaticLengthQueue queue = new StaticLengthQueue(5);
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        assertEquals(3, queue.size());
        assertEquals("A", queue.peek());
    }

    @Test
    public void givenEnqueueSingleElement_whenDequeueSingleElement_thenExpectedResultIsReturned() {
        StaticLengthQueue queue = new StaticLengthQueue(5);
        queue.enqueue("A");
        assertEquals("A", queue.dequeue());
        assertEquals(0, queue.size());
    }

    @Test
    public void givenEnqueueThreeElements_whenDequeueMultipleElements_thenExpectedResultIsReturned() {
        StaticLengthQueue queue = new StaticLengthQueue(5);
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        assertEquals("A", queue.dequeue());
        assertEquals("B", queue.dequeue());
        assertEquals("C", queue.dequeue());
        assertEquals(0, queue.size());
    }
}

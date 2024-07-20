import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicLengthQueueTest {

    @Test
    public void givenAnEmptyQueue_whenEnqueueMoreThanCapacity_thenExpectedResultIsReturned() {
        DynamicLengthQueue queue = new DynamicLengthQueue(3);
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
        assertEquals(4, queue.size());
    }
}

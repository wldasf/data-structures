import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicLengthStackTest {
    private DynamicLengthStack stack = new DynamicLengthStack();

    @Test
     public void givenNotFullDynamicStack_whenPushItemToStack_thenExpectedResultIsReturned() {
         stack.push("A");
         assertEquals(1, stack.size());
         assertEquals("A", stack.peek());
     }

     @Test
    public void givenEmptyStack_whenPushTwoItemsAndPopTheTopItem_thenExpectedResultIsReturned() {
         stack.push("A");
         stack.push("B");
         assertEquals("B", stack.pop());
         assertEquals(1, stack.size());
         assertEquals("A", stack.peek());
    }

    @Test
    public void givenAnEmptyStack_whenPeekingAtStack_thenExpectedResultIsreturned() {
        stack.push("A");
        stack.push("B");
        assertEquals("A", stack.peek());
    }

}

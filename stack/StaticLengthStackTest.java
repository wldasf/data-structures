import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StaticLengthStackTest {

    @Test
    public void givenEmptyStack_whenStackSizeZero_thenPrintTrue() {
        StaticLengthStack stack = new StaticLengthStack(5);
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    @Test
    public void givenStaticStackOfSizeThree_whenTwoItemsPushedAndTwoItemsPopped_thenPushAssertEqualTrueAndPopAssertEqualtrue() {
        StaticLengthStack stack = new StaticLengthStack(3);
        stack.push(10);
        stack.push(20);
        assertFalse(stack.isEmpty());
        assertEquals(2, stack.size());

        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test(expected = IllegalStateException.class)
    public void givenEmptyStack_whenPoppingAnItemFromStack_thenThrowAnException() {
        StaticLengthStack stack = new StaticLengthStack(5);
        stack.pop();
    }

    @Test(expected = IllegalStateException.class)
    public void givenFullStack_whenPushedMaxItems_thenThrowException() {
        StaticLengthStack stack = new StaticLengthStack(2);
        stack.push(10);
        stack.push(20);
        stack.push(30);
    }
}

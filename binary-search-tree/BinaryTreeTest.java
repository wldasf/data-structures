import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BinaryTreeTest {

    @Test
    public void givenAnEmptyBinaryTree_whenInsertRandomNumbers_thenAssertsShouldReturnExpected() {
        BinaryTree bst = new BinaryTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);

        assertTrue(bst.search(4)); // True
        assertEquals(2, bst.depth(4)); // 2
        assertEquals(3, bst.treeDepth()); // 3
    }
}

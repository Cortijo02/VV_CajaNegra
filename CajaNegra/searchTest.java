import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.bst.BST;
import com.bst.IBinaryTree;
import com.bst.Node;
import com.exceptions.DepthException;
import org.junit.jupiter.api.Test;

public class searchTest {
    BST<Integer> bst;

    void assertFindNode(int n) throws DepthException {
        bst = new BST(n);
        Node nodo = new Node(n);
        assertEquals(nodo, bst.search(n));
    }

    void assertNotFindNode(int n) throws DepthException {
        bst = new BST<>();
        assertNull(bst.search(n));
    }

    @Test
    void V1() throws DepthException { assertNotFindNode(-2501); }

    @Test
    void V2() throws DepthException { assertFindNode(-2500); }

    @Test
    void V3() throws DepthException { assertFindNode(-2499); }

    @Test
    void V4() throws DepthException { assertFindNode(0); }

    @Test
    void V5() throws DepthException { assertFindNode(2498); }

    @Test
    void V6() throws DepthException { assertFindNode(2499); }

    @Test
    void V7() throws DepthException { assertNotFindNode(2500); }
}

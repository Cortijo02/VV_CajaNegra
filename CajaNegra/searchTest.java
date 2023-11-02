import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.bst.BST;
import com.bst.IBinaryTree;
import com.bst.Node;
import com.exceptions.DepthException;
import org.junit.jupiter.api.Test;

public class searchTest {
    BST<Integer> bst;

    @Test
    void V1() {
        bst = new BST<>();
        assertEquals(null, bst.search(-2501));
    }

    @Test
    void V2() throws DepthException {
        bst = new BST(-2500);
        Node nodo = new Node(-2500);
        //Node<Integer> nodo = new Node(-2500);
        assertEquals(nodo, bst.search(-2500));
    }

    @Test
    void V3() {}

    @Test
    void V4() {}

    @Test
    void V5() {}

    @Test
    void V6() {}

    @Test
    void V7() {}
}

import com.bst.BST;
import com.bst.Node;
import com.exceptions.DepthException;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertThrows;

class getSubTreeTest {
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvFileSource(resources = "Pruebas caja negra (getsubtree).csv",
            numLinesToSkip = 1,
            lineSeparator = "\n",
            delimiterString = ";")
    void testInsert(int a, String esperado) throws DepthException {
        BST arbol = new BST();

        for(int i = 0 ; i < 25; i++){
            arbol.insert(i+1,true);
        }
        if(esperado.equals("ok")){
            Node nodo = new Node<>(a);
            arbol.getSubTree(nodo);
        }else{
            assertThrows(IllegalArgumentException.class,()->{
                Node nodo = new Node<>(a);
                arbol.getSubTree(nodo);
            });
        }
    }
}
import com.bst.BST;
import com.bst.Node;
import com.exceptions.DepthException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class getSubTreeTest {
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvFileSource(resources = "Pruebas caja negra (getsubtree).csv",
            numLinesToSkip = 1,
            lineSeparator = "\n",
            delimiterString = ";")
    void testInsert(Node nodo, String esperado) throws DepthException {
        BST arbol = new BST();
        if(esperado.equals("ok")){
            arbol.insert(Integer.valueOf(nodo.toString()),true);
        }else{
            assertThrows(,() ->{
               arbol.getSubTree(nodo);
            });
        }
    }
}
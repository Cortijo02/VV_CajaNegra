import com.bst.BST;
import com.bst.Node;

import static org.junit.jupiter.api.Assertions.assertEquals;

class searchTest {
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvFileSource(resources = "Pruebas caja negra (search).csv",
            numLinesToSkip = 1,
            lineSeparator = "\n",
            delimiterString = ";")
    void testSearch(int a, int esperada) {
        BST arbol =new BST<>();
        Node salida = arbol.search(a);
        Node aux = new Node<>(esperada);
        assertEquals(aux,salida);
    }
}
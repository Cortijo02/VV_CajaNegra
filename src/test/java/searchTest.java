import com.bst.BST;
import com.bst.Node;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class searchTest {
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvFileSource(resources = "Pruebas caja negra (search).csv",
            numLinesToSkip = 1,
            lineSeparator = "\n",
            delimiterString = ";")
    void testSearch(int entrada, String esperada) {
        BST arbol = new BST<>();
        if(-2501<entrada && entrada<2500){
            arbol = new BST<>(entrada);
        }
        Node salida = arbol.search(entrada);
        if (esperada.equals("null") ) {
            assertNull(salida);
        }else {
            int aux = Integer.valueOf(esperada);
            assertEquals(salida.getContent(),aux);
        }
    }
}
import com.bst.BST;
import com.exceptions.BetweenLevelException;
import com.exceptions.DepthException;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class printBetweenLevelTest {
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvFileSource(resources = "Pruebas caja negra (printbetween).csv",
            numLinesToSkip = 1,
            lineSeparator = "\n",
            delimiterString = ";")
    void testPrintBetween(int a, int b, String esperado) throws DepthException, BetweenLevelException {
        BST arbol = new BST<>();
        for (int i = 0 ; i < 50 ; i++){
            arbol.insert(i,false);
        }
        if(esperado.equals("exception")) {
            assertThrows(BetweenLevelException.class, () -> {
                arbol.printBetweenLevel(b, a);
            });
        }else{
            List lista = arbol.printBetweenLevel(b,a);
            assertNotNull(lista);
        }
    }
}
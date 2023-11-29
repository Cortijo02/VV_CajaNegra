import com.bst.BST;
import com.exceptions.BetweenLevelException;
import com.exceptions.DepthException;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class insertTest {
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvFileSource(resources = "Pruebas caja negra (insert).csv",
            numLinesToSkip = 1,
            lineSeparator = "\n",
            delimiterString = ";")
    void testInsert(int a, boolean recursivo, String esperado, int profundidad) throws DepthException {
        BST arbol = new BST<>();
        for (int i = 0 ; i < profundidad-1 ; i++){
            arbol.insert(i+1,false);
        }
        if(esperado.equals("exception")) {
            assertThrows(DepthException.class, () -> {
                arbol.insert(a,recursivo);
            });
        }else if(esperado.equals("mal")){
            assertThrows(IllegalArgumentException.class, () -> {
                arbol.insert(a,recursivo);
            });
        }else{
            arbol.insert(a,recursivo);
        }
    }
}
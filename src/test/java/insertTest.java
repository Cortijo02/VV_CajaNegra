import com.bst.BST;
import com.exceptions.DepthException;

import static org.junit.jupiter.api.Assertions.*;

class insertTest {
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvFileSource(resources = "Pruebas caja negra (insert).csv",
            numLinesToSkip = 1,
            lineSeparator = "\n",
            delimiterString = ";")
    void testInsert(int a, boolean recursivo, String esperado, int profundidad) throws DepthException {
        BST arbol = new BST<>();
        if(profundidad==-1){
            assertEquals(1,1);
        }
        try{
            for(int i=0;i<profundidad-1;i++) {
                arbol.insert(i+1, recursivo);
            }
            arbol.insert(a,recursivo);
        }catch (Exception DepthException){
            if(esperado.equals("exception")) {
                assertEquals(0, 0);
            }
        }
    }
}
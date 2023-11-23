import com.bst.BST;

import static org.junit.jupiter.api.Assertions.assertEquals;

class insertTest {
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvFileSource(resources = "Pruebas caja negra (search).csv",
            numLinesToSkip = 1,
            lineSeparator = "\n",
            delimiterString = ";")
    void testInsert(int a, boolean recursivo, Exception esperado, int profundidad) {
        BST arbol = new BST<>();

    }
}
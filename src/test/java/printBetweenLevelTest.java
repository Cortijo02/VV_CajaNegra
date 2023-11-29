import com.bst.BST;
import com.exceptions.DepthException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class printBetweenLevelTest {
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvFileSource(resources = "Pruebas caja negra (insert).csv",
            numLinesToSkip = 1,
            lineSeparator = "\n",
            delimiterString = ";")
    void testInsert() {

    }
}
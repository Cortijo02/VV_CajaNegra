@org.junit.jupiter.params.ParameterizedTest
@org.junit.jupiter.params.provider.CsvFileSource(resources= "Pruebas caja negra .csv",
numLinesToSkip = 1,
        lineSeparator = "\n",
        delimiterString = ",")

void testSearch(int a, String esperada){

        }
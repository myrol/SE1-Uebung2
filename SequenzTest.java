import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SequenzTest {
    String[] sequence = {"A","B","C","D"};
    Testing test;
    @BeforeEach
    void TestingTestSetup(){
        test = new Testing(new String[][]{{"A", "C"}, {"C", "D"}, {"B", "C"}});
    }

    @Test
    @DisplayName("Die Methode wird auf ihre Ausgabe getestet.")
    void TestisWellSorted(){
        assertTrue(test.isWellSorted(sequence));
        assertFalse(test.isWellSorted(new String[]{"D","C","B","A"}));
    }
}
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class SequenzIFTest {
    Sequenz s;
    String[] testString =  {"A","B","C","D"};
    @BeforeEach
    void testUmgebung()
    {
        s = new Sequenz(new String[][]{{"A","C"},{"C","D"},{"B","C"}});
    }
    @Test
    @DisplayName("Ein Input String soll nicht ausgefuehrt werden koennen, wenn der Vorgaenger nicht abgearbeitet wurde.")
    void isWellSorted() {
        assertTrue(s.isWellSorted(testString));
        assertFalse(s.isWellSorted(new String[]{"C","C","A","D"}));
        assertFalse(s.isWellSorted(new String[]{"C","A"}));
        assertFalse(s.isWellSorted(new String[]{"D", "C", "B", "A"}));
    }

    @Test
    @DisplayName("Ein Hashmap soll mit Strings als Key und mit False Booleans als Value gefuellt werden.")
    void fill() {
        HashMap<String, Boolean> test = s.fill(testString);
        assertFalse(test.get("A"));
        assertFalse(test.get("B"));
        assertFalse(test.get("C"));
        assertFalse(test.get("D"));
        assertTrue((test.get("E") == null));
    }
}
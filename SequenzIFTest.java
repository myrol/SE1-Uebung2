import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenzIFTest {

    @Test
    @DisplayName("Ein Input String soll nicht ausgeführt werden können, wenn der Vorgänger nicht abgearbeitet wurde.")
    void isWellSorted() {
        Sequenz s = new Sequenz(new String[][]{{"A","C"},{"C","D"},{"B","C"}});
        assertTrue(s.isWellSorted(new String[]{"A", "B", "C", "D"}));
        assertFalse(s.isWellSorted(new String[]{"D","C","B","A"}));
    }

    @Test
    @DisplayName("Ein Hashmap soll mit Strings als Key und Boolean als Value gefüllt werden.")
    void fill() {
        fail();
    }
}
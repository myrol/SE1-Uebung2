import org.junit.jupiter.api.BeforeAll;
import java.util.HashMap;
public class Sequenz implements SequenzIF {
    String[][] abh;
    public Sequenz(String[][] _abh) {
        abh = _abh;
    }

    @Override
    public boolean isWellSorted(String[] seq) {
        HashMap<String, Boolean> h = fill(seq);

        // Schleife fuer die Sequenz
        for (int i = 0; i < seq.length; i++) {
            String currentLetter = seq[i];
            // Pruefe, ob aktueller Buchstabe ein Nachfolger ist
            for(int j = 0; j < abh.length; j++) {
                if (abh[j][1].equals(currentLetter) && h.get(abh[j][0]) == false) {
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public HashMap<String, Boolean> fill(String[] arr) {
        HashMap<String, Boolean> h = new HashMap<String, Boolean>();

        for (int i = 0; i < arr.length; i++) {
            h.put(arr[i], false);
        }

        return h;
    }
}
